package net.dean.jraw.meta

import java.lang.reflect.Method

data class EndpointMeta(
    /** HTTP request method ("GET", "POST", etc.) */
    val method: String,

    /** Endpoint path, such as `/api/comment` */
    val path: String,

    /**
     * If [subredditPrefix], includes the text `[/s/{subreddit}]` to signify that the client may optionally specify a
     * subreddit prefix.
     */
    val displayPath: String = path,

    /** The OAuth scope required to send a successful request to this endpoint */
    val oauthScope: String,

    /**
     * The URL to reddit's documentation at https://www.saidit.net/dev/api/oauth. For example, the doc link for
     * `POST /api/comment` is `https://www.saidit.net/dev/api/oauth#POST_api_comment`.
     */
    val redditDocLink: String,

    /**
     * True if the original path was prefixed with "[/s/subreddit]", indicating that a request can be made either to
     * `/foo` or `/s/{subreddit}/foo`
     */
    val subredditPrefix: Boolean,

    /** Where the endpoint is implemented, if any */
    val implementation: Method? = null,

    /** A URL that links to the source code for the method that implements this endpoint */
    val sourceUrl: String? = null,

    /** Current implementation status */
    val status: ImplementationStatus = ImplementationStatus.PLANNED
)

