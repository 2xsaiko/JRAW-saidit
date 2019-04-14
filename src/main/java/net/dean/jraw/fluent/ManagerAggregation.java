package net.dean.jraw.fluent;

import net.dean.jraw.RedditClient;
import net.dean.jraw.managers.AccountManager;
import net.dean.jraw.managers.InboxManager;
import net.dean.jraw.managers.ModerationManager;
import net.dean.jraw.managers.MultiRedditManager;
import net.dean.jraw.managers.WikiManager;

/**
 * This class is a collection of managers pulled from the {@link net.dean.jraw.managers} package.
 */
public final class ManagerAggregation {
    private final RedditClient reddit;
    private final AccountManager account;
    private final InboxManager inbox;
    private final ModerationManager moderation;
    private final MultiRedditManager multis;
    private final WikiManager wikis;

    /**
     * Creates a new ManagerAggregation. Creates each manager by passing the given RedditClient as a parameter.
     *
     * @param reddit The RedditClient that will be used to instantiate each manager
     * @return A new ManagerAggregation
     */
    public static ManagerAggregation newInstance(RedditClient reddit) {
        return new ManagerAggregation(
                reddit,
                new AccountManager(reddit),
                new InboxManager(reddit),
                new ModerationManager(reddit),
                new MultiRedditManager(reddit),
                new WikiManager(reddit)
        );
    }

    public ManagerAggregation(RedditClient reddit, AccountManager account, InboxManager inbox,
                              ModerationManager moderation, MultiRedditManager multis,
                              WikiManager wikis) {
        if (reddit == null ||
                account == null ||
                moderation == null ||
                multis == null ||
                wikis == null ||
                inbox == null)
            throw new IllegalArgumentException("Arguments to this constructor may not be null");
        this.reddit = reddit;
        this.account = account;
        this.inbox = inbox;
        this.moderation = moderation;
        this.multis = multis;
        this.wikis = wikis;
    }

    public RedditClient reddit() { return reddit; }

    public AccountManager account() { return account; }
    public InboxManager inbox() { return inbox; }
    public ModerationManager moderation() { return moderation; }
    public MultiRedditManager multis() { return multis; }
    public WikiManager wiki() { return wikis; }
}
