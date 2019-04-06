package net.dean.jraw.docs.samples;

import net.dean.jraw.RedditClient;
import net.dean.jraw.docs.CodeSample;
import net.dean.jraw.models.Subreddit;

@SuppressWarnings("unused")
final class Basics {
//    @CodeSample
//    void updateFlair(RedditClient redditClient) {
//        // "Navigate" to the subreddit
//        SubredditReference subreddit = redditClient.subreddit("RocketLeague");
//
//        // Request available user flair
//        List<Flair> userFlairOptions = subreddit.userFlairOptions();
//
//        if (!userFlairOptions.isEmpty()) {
//            // Arbitrarily choose a new Flair
//            Flair newFlair = userFlairOptions.get(0);
//
//            // Update the flair on the website
//            subreddit.selfUserFlair().updateToTemplate(newFlair.getId(), "");
//        }
//    }

    @CodeSample
    void referenceChain(RedditClient redditClient) {
        Subreddit sr = redditClient.subreddit("RocketLeague").about();
    }
}
