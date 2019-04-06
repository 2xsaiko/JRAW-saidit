package net.dean.jraw.references

/**
 * A Reference is a cheap to create, immutable, conceptual link to a reddit resource.
 *
 * References have a subject that describes the name or ID of the resource they are referencing. For example, a
 * [SubredditReference] created for /s/pics would have the subject "pics".
 *
 * References are used to provide a fluent interface for describing the actions a user can take on an API. For example,
 * this code will get basic information about a subreddit:
 *
 * ```kotlin
 * val pics: Subreddit = redditClient.subreddit("pics").about()
 * ```
 *
 * All References **must** have internal constructors and be instantiated by [net.dean.jraw.RedditClient], other
 * References, or models that inherit [Referenceable].
 */
interface Reference
