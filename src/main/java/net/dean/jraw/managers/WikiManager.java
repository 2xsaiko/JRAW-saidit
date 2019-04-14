package net.dean.jraw.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import net.dean.jraw.ApiException;
import net.dean.jraw.EndpointImplementation;
import net.dean.jraw.Endpoints;
import net.dean.jraw.RedditClient;
import net.dean.jraw.http.HttpRequest;
import net.dean.jraw.http.NetworkException;
import net.dean.jraw.http.RestResponse;
import net.dean.jraw.models.WikiPage;
import net.dean.jraw.models.WikiPageSettings;
import net.dean.jraw.util.JrawUtils;

/**
 * This class is responsible for managing a wiki
 */
public class WikiManager extends AbstractManager {
    /**
     * Instantiates a new WikiManager
     * @param client The RedditClient to use
     */
    public WikiManager(RedditClient client) {
        super(client);
    }

    /**
     * Gets a list of names of wiki pages for Reddit
     *
     * @return A list of Reddit's wiki pages
     * @throws NetworkException If the request was not successful
     */
    public List<String> getPages() throws NetworkException {
        return getPages(null);
    }

    /**
     * Gets a list of names of wiki pages for a certain subreddit
     *
     * @param subreddit The subreddit to use
     * @return A list of wiki pages for this subreddit
     * @throws NetworkException If the request was not successful
     */
    @EndpointImplementation(Endpoints.WIKI_PAGES)
    public List<String> getPages(String subreddit) throws NetworkException {
        String path = JrawUtils.getSubredditPath(subreddit, "/wiki/pages") + ".json";

        List<String> pages = new ArrayList<>();
        JsonNode pagesNode = reddit.execute(reddit.request()
                .path(path)
                .build()).getJson().get("data");

        for (JsonNode page : pagesNode) {
            pages.add(page.asText());
        }

        return pages;
    }

    /**
     * Gets a WikiPage that represents one of Reddit's main pages. See <a href="http://www.reddit.com/wiki/pages">here</a>
     * for a list.
     *
     * @param page The page to get
     * @return A WikiPage for the given page
     * @throws NetworkException If the request was not successful
     *
     * @see #getPages()
     */
    public WikiPage get(String page) throws NetworkException {
        return get(null, page);
    }

    /**
     * Gets a WikiPage for a certain subreddit
     *
     * @param subreddit The subreddit to use
     * @param page The page to get
     * @return A WikiPage for the given page
     * @throws NetworkException If the request was not successful
     */
    @EndpointImplementation(Endpoints.WIKI_PAGE)
    public WikiPage get(String subreddit, String page) throws NetworkException {
        String path = JrawUtils.getSubredditPath(subreddit, "/wiki/" + page) + ".json";

        HttpRequest r = reddit.request()
                .path(path)
                .build();
        return reddit.execute(r).as(WikiPage.class);
    }

    /**
     * Edit (or create) a wiki page
     *
     * @param subreddit Subreddit the page is in
     * @param page Page to edit/create
     * @param content Content of the page
     * @param reason Reason for the edit
     * @throws NetworkException If the request wasn't successful
     * @throws ApiException If the API returned an error
     */
    @EndpointImplementation(Endpoints.WIKI_EDIT)
    public void edit(String subreddit, String page, String content, String reason)
            throws NetworkException, ApiException {
        String path = JrawUtils.getSubredditPath(subreddit, Endpoints.WIKI_EDIT.getEndpoint().getUri());

        Map<String, String> args = JrawUtils.mapOf(
                "page", page,
                "content", content,
                "reason", reason != null ? reason : ""
        );

        RestResponse response = reddit.execute(reddit.request()
                .post(args)
                .path(path)
                .build());
        if (response.hasErrors()) {
            throw response.getError();
        }
    }

    /**
     * Gets the settings for a wiki page for the front page. Must be an admin.
     *
     * @param page The page to get
     * @return A WikiPageSettings that represents the settings of the given wiki page
     * @throws NetworkException If there request was not successful
     */
    public WikiPageSettings getSettings(String page) throws NetworkException {
        return getSettings(null, page);
    }

    /**
     * Gets the settings for a wiki page for a certain subreddit. Must be a moderator of that subreddit.
     *
     * @param subreddit The subreddit to use. Use null or an empty string for the front page.
     * @param page The page to get
     * @return A WikiPageSettings that represents the settings of the given wiki page
     * @throws NetworkException If there request was not successful
     */
    @EndpointImplementation(Endpoints.WIKI_SETTINGS_PAGE_GET)
    public WikiPageSettings getSettings(String subreddit, String page) throws NetworkException {
        String path = JrawUtils.getSubredditPath(subreddit, "/wiki/settings/" + page) + ".json";

        return reddit.execute(reddit.request()
                .path(path)
                .build()).as(WikiPageSettings.class);
    }
}
