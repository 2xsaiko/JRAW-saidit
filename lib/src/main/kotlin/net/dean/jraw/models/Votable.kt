package net.dean.jraw.models

/**
 * Common interface for models that can be upvoted or downvoted
 */
interface Votable {
    /** How the logged-in user voted on the model */
    val vote: VoteState

    /** Upvotes minus downvotes */
    val score: Int
}
