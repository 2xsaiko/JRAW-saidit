<!--- Generated 2019-04-06 at 20:17:09 CEST. Use `./gradlew :meta:update` to update. DO NOT MODIFY DIRECTLY -->

Endpoints
=========

This file contains a list of all the endpoints (regardless of if they have been implemented) that can be found at the [official reddit API docs](https://www.saidit.net/dev/api/oauth). To update this file, run `./gradlew :meta:update`

So far, API completion is at **34.43%**. 42 out of 122 endpoints (ignoring 3 endpoints not planned) have been implemented 

(any scope)
-----------

20.00% completion (1 implemented, 5 planned, and 1 not planned)

| Method | Endpoint                                                                                  | Implementation                                                                                                                                       |
|:------:| ----------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `POST` | [`/api/comment`](https://www.saidit.net/dev/api/oauth#POST_api_comment)                   | [`ReplyableReference.reply()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/ReplyableReference.kt#L14) |
| `POST` | [`[/s/{subreddit}]/api/friend`](https://www.saidit.net/dev/api/oauth#POST_api_friend)     | None                                                                                                                                                 |
| `POST` | [`/api/new_captcha`](https://www.saidit.net/dev/api/oauth#POST_api_new_captcha)           | None                                                                                                                                                 |
| `POST` | [`[/s/{subreddit}]/api/unfriend`](https://www.saidit.net/dev/api/oauth#POST_api_unfriend) | None                                                                                                                                                 |
| `GET`  | [`/api/v1/scopes`](https://www.saidit.net/dev/api/oauth#GET_api_v1_scopes)                | None                                                                                                                                                 |
| `GET`  | [`/captcha/{iden}`](https://www.saidit.net/dev/api/oauth#GET_captcha_{iden})              | None                                                                                                                                                 |
| `GET`  | [`/api/needs_captcha`](https://www.saidit.net/dev/api/oauth#GET_api_needs_captcha)        | Not planned                                                                                                                                          |

account
-------

100.00% completion (1 implemented, 0 planned, and 0 not planned)

| Method  | Endpoint                                                                         | Implementation                                                                                                                                           |
|:-------:| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `PATCH` | [`/api/v1/me/prefs`](https://www.saidit.net/dev/api/oauth#PATCH_api_v1_me_prefs) | [`SelfUserReference.patchPrefs()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SelfUserReference.kt#L203) |

creddits
--------

0.00% completion (0 implemented, 2 planned, and 0 not planned)

| Method | Endpoint                                                                                                | Implementation |
|:------:| ------------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`/api/v1/gold/gild/{fullname}`](https://www.saidit.net/dev/api/oauth#POST_api_v1_gold_gild_{fullname}) | None           |
| `POST` | [`/api/v1/gold/give/{username}`](https://www.saidit.net/dev/api/oauth#POST_api_v1_gold_give_{username}) | None           |

edit
----

100.00% completion (3 implemented, 0 planned, and 0 not planned)

| Method | Endpoint                                                                          | Implementation                                                                                                                                                                |
|:------:| --------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `POST` | [`/api/del`](https://www.saidit.net/dev/api/oauth#POST_api_del)                   | [`PublicContributionReference.delete()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L92)       |
| `POST` | [`/api/editusertext`](https://www.saidit.net/dev/api/oauth#POST_api_editusertext) | [`PublicContributionReference.edit()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L101)        |
| `POST` | [`/api/sendreplies`](https://www.saidit.net/dev/api/oauth#POST_api_sendreplies)   | [`PublicContributionReference.sendReplies()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L114) |

flair
-----

0.00% completion (0 implemented, 3 planned, and 0 not planned)

| Method | Endpoint                                                                                                | Implementation |
|:------:| ------------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`[/s/{subreddit}]/api/flairselector`](https://www.saidit.net/dev/api/oauth#POST_api_flairselector)     | None           |
| `POST` | [`[/s/{subreddit}]/api/selectflair`](https://www.saidit.net/dev/api/oauth#POST_api_selectflair)         | None           |
| `POST` | [`[/s/{subreddit}]/api/setflairenabled`](https://www.saidit.net/dev/api/oauth#POST_api_setflairenabled) | None           |

history
-------

100.00% completion (1 implemented, 0 planned, and 0 not planned)

| Method | Endpoint                                                                                       | Implementation                                                                                                                               |
|:------:| ---------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `GET`  | [`/user/{username}/{where}`](https://www.saidit.net/dev/api/oauth#GET_user_{username}_{where}) | [`UserReference.history()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/UserReference.kt#L84) |

identity
--------

100.00% completion (3 implemented, 0 planned, and 0 not planned)

| Method | Endpoint                                                                             | Implementation                                                                                                                                      |
|:------:| ------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `GET`  | [`/api/v1/me`](https://www.saidit.net/dev/api/oauth#GET_api_v1_me)                   | [`UserReference.query()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/UserReference.kt#L39)          |
| `GET`  | [`/api/v1/me/prefs`](https://www.saidit.net/dev/api/oauth#GET_api_v1_me_prefs)       | [`SelfUserReference.prefs()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SelfUserReference.kt#L189) |
| `GET`  | [`/api/v1/me/trophies`](https://www.saidit.net/dev/api/oauth#GET_api_v1_me_trophies) | [`UserReference.trophies()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/UserReference.kt#L54)       |

modconfig
---------

0.00% completion (0 implemented, 9 planned, and 0 not planned)

| Method | Endpoint                                                                                                          | Implementation |
|:------:| ----------------------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`[/s/{subreddit}]/api/delete_sr_banner`](https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_banner)         | None           |
| `POST` | [`[/s/{subreddit}]/api/delete_sr_header`](https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_header)         | None           |
| `POST` | [`[/s/{subreddit}]/api/delete_sr_icon`](https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_icon)             | None           |
| `POST` | [`[/s/{subreddit}]/api/delete_sr_img`](https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_img)               | None           |
| `POST` | [`/api/site_admin`](https://www.saidit.net/dev/api/oauth#POST_api_site_admin)                                     | None           |
| `POST` | [`[/s/{subreddit}]/api/subreddit_stylesheet`](https://www.saidit.net/dev/api/oauth#POST_api_subreddit_stylesheet) | None           |
| `POST` | [`[/s/{subreddit}]/api/upload_sr_img`](https://www.saidit.net/dev/api/oauth#POST_api_upload_sr_img)               | None           |
| `GET`  | [`/s/{subreddit}/about/edit`](https://www.saidit.net/dev/api/oauth#GET_s_{subreddit}_about_edit)                  | None           |
| `GET`  | [`[/s/{subreddit}]/stylesheet`](https://www.saidit.net/dev/api/oauth#GET_stylesheet)                              | None           |

modcontributors
---------------

0.00% completion (0 implemented, 2 planned, and 0 not planned)

| Method | Endpoint                                                                                            | Implementation |
|:------:| --------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`/api/mute_message_author`](https://www.saidit.net/dev/api/oauth#POST_api_mute_message_author)     | None           |
| `POST` | [`/api/unmute_message_author`](https://www.saidit.net/dev/api/oauth#POST_api_unmute_message_author) | None           |

modflair
--------

0.00% completion (0 implemented, 8 planned, and 0 not planned)

| Method | Endpoint                                                                                                        | Implementation |
|:------:| --------------------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`[/s/{subreddit}]/api/clearflairtemplates`](https://www.saidit.net/dev/api/oauth#POST_api_clearflairtemplates) | None           |
| `POST` | [`[/s/{subreddit}]/api/deleteflair`](https://www.saidit.net/dev/api/oauth#POST_api_deleteflair)                 | None           |
| `POST` | [`[/s/{subreddit}]/api/deleteflairtemplate`](https://www.saidit.net/dev/api/oauth#POST_api_deleteflairtemplate) | None           |
| `POST` | [`[/s/{subreddit}]/api/flair`](https://www.saidit.net/dev/api/oauth#POST_api_flair)                             | None           |
| `POST` | [`[/s/{subreddit}]/api/flairconfig`](https://www.saidit.net/dev/api/oauth#POST_api_flairconfig)                 | None           |
| `POST` | [`[/s/{subreddit}]/api/flaircsv`](https://www.saidit.net/dev/api/oauth#POST_api_flaircsv)                       | None           |
| `GET`  | [`[/s/{subreddit}]/api/flairlist`](https://www.saidit.net/dev/api/oauth#GET_api_flairlist)                      | None           |
| `POST` | [`[/s/{subreddit}]/api/flairtemplate`](https://www.saidit.net/dev/api/oauth#POST_api_flairtemplate)             | None           |

modothers
---------

0.00% completion (0 implemented, 1 planned, and 0 not planned)

| Method | Endpoint                                                                                              | Implementation |
|:------:| ----------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`[/s/{subreddit}]/api/setpermissions`](https://www.saidit.net/dev/api/oauth#POST_api_setpermissions) | None           |

modposts
--------

33.33% completion (4 implemented, 8 planned, and 0 not planned)

| Method | Endpoint                                                                                          | Implementation                                                                                                                                                                |
|:------:| ------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `POST` | [`/api/approve`](https://www.saidit.net/dev/api/oauth#POST_api_approve)                           | [`PublicContributionReference.approve()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L185)     |
| `POST` | [`/api/distinguish`](https://www.saidit.net/dev/api/oauth#POST_api_distinguish)                   | [`PublicContributionReference.distinguish()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L137) |
| `POST` | [`/api/remove`](https://www.saidit.net/dev/api/oauth#POST_api_remove)                             | [`PublicContributionReference.remove()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L171)      |
| `POST` | [`/api/set_subreddit_sticky`](https://www.saidit.net/dev/api/oauth#POST_api_set_subreddit_sticky) | [`SubmissionReference.stickyPost()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SubmissionReference.kt#L114)                  |
| `POST` | [`/api/ignore_reports`](https://www.saidit.net/dev/api/oauth#POST_api_ignore_reports)             | None                                                                                                                                                                          |
| `POST` | [`/api/lock`](https://www.saidit.net/dev/api/oauth#POST_api_lock)                                 | None                                                                                                                                                                          |
| `POST` | [`/api/marknsfw`](https://www.saidit.net/dev/api/oauth#POST_api_marknsfw)                         | None                                                                                                                                                                          |
| `POST` | [`/api/set_contest_mode`](https://www.saidit.net/dev/api/oauth#POST_api_set_contest_mode)         | None                                                                                                                                                                          |
| `POST` | [`/api/set_suggested_sort`](https://www.saidit.net/dev/api/oauth#POST_api_set_suggested_sort)     | None                                                                                                                                                                          |
| `POST` | [`/api/unignore_reports`](https://www.saidit.net/dev/api/oauth#POST_api_unignore_reports)         | None                                                                                                                                                                          |
| `POST` | [`/api/unlock`](https://www.saidit.net/dev/api/oauth#POST_api_unlock)                             | None                                                                                                                                                                          |
| `POST` | [`/api/unmarknsfw`](https://www.saidit.net/dev/api/oauth#POST_api_unmarknsfw)                     | None                                                                                                                                                                          |

modself
-------

0.00% completion (0 implemented, 3 planned, and 0 not planned)

| Method | Endpoint                                                                                                                | Implementation |
|:------:| ----------------------------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`[/s/{subreddit}]/api/accept_moderator_invite`](https://www.saidit.net/dev/api/oauth#POST_api_accept_moderator_invite) | None           |
| `POST` | [`/api/leavecontributor`](https://www.saidit.net/dev/api/oauth#POST_api_leavecontributor)                               | None           |
| `POST` | [`/api/leavemoderator`](https://www.saidit.net/dev/api/oauth#POST_api_leavemoderator)                                   | None           |

modwiki
-------

0.00% completion (0 implemented, 5 planned, and 0 not planned)

| Method | Endpoint                                                                                                              | Implementation |
|:------:| --------------------------------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`[/s/{subreddit}]/api/wiki/alloweditor/{act}`](https://www.saidit.net/dev/api/oauth#POST_api_wiki_alloweditor_{act}) | None           |
| `POST` | [`[/s/{subreddit}]/api/wiki/hide`](https://www.saidit.net/dev/api/oauth#POST_api_wiki_hide)                           | None           |
| `POST` | [`[/s/{subreddit}]/api/wiki/revert`](https://www.saidit.net/dev/api/oauth#POST_api_wiki_revert)                       | None           |
| `GET`  | [`[/s/{subreddit}]/wiki/settings/{page}`](https://www.saidit.net/dev/api/oauth#GET_wiki_settings_{page})              | None           |
| `POST` | [`[/s/{subreddit}]/wiki/settings/{page}`](https://www.saidit.net/dev/api/oauth#POST_wiki_settings_{page})             | None           |

mysubreddits
------------

33.33% completion (1 implemented, 2 planned, and 0 not planned)

| Method | Endpoint                                                                                                 | Implementation                                                                                                                                      |
|:------:| -------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `GET`  | [`/api/v1/me/karma`](https://www.saidit.net/dev/api/oauth#GET_api_v1_me_karma)                           | [`SelfUserReference.karma()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SelfUserReference.kt#L226) |
| `GET`  | [`/api/v1/me/friends/{username}`](https://www.saidit.net/dev/api/oauth#GET_api_v1_me_friends_{username}) | None                                                                                                                                                |
| `GET`  | [`/subs/mine/{where}`](https://www.saidit.net/dev/api/oauth#GET_subs_mine_{where})                       | None                                                                                                                                                |

privatemessages
---------------

75.00% completion (6 implemented, 2 planned, and 0 not planned)

| Method | Endpoint                                                                                    | Implementation                                                                                                                                      |
|:------:| ------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `POST` | [`/api/compose`](https://www.saidit.net/dev/api/oauth#POST_api_compose)                     | [`InboxReference.compose()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/InboxReference.kt#L40)      |
| `POST` | [`/api/del_msg`](https://www.saidit.net/dev/api/oauth#POST_api_del_msg)                     | [`InboxReference.delete()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/InboxReference.kt#L137)      |
| `POST` | [`/api/read_all_messages`](https://www.saidit.net/dev/api/oauth#POST_api_read_all_messages) | [`InboxReference.markAllRead()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/InboxReference.kt#L121) |
| `POST` | [`/api/read_message`](https://www.saidit.net/dev/api/oauth#POST_api_read_message)           | [`InboxReference.markRead()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/InboxReference.kt#L112)    |
| `POST` | [`/api/unread_message`](https://www.saidit.net/dev/api/oauth#POST_api_unread_message)       | [`InboxReference.markRead()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/InboxReference.kt#L112)    |
| `GET`  | [`/message/{where}`](https://www.saidit.net/dev/api/oauth#GET_message_{where})              | [`InboxReference.iterate()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/InboxReference.kt#L28)      |
| `POST` | [`/api/block`](https://www.saidit.net/dev/api/oauth#POST_api_block)                         | None                                                                                                                                                |
| `POST` | [`/api/unblock_subreddit`](https://www.saidit.net/dev/api/oauth#POST_api_unblock_subreddit) | None                                                                                                                                                |

read
----

34.48% completion (10 implemented, 20 planned, and 1 not planned)

| Method | Endpoint                                                                                                           | Implementation                                                                                                                                                       |
|:------:| ------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `GET`  | [`/api/morechildren`](https://www.saidit.net/dev/api/oauth#GET_api_morechildren)                                   | [`CommentNode.loadMore()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/tree/CommentNode.kt#L-1)                                  |
| `GET`  | [`/api/multi/mine`](https://www.saidit.net/dev/api/oauth#GET_api_multi_mine)                                       | [`UserReference.listMultis()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/UserReference.kt#L101)                     |
| `GET`  | [`/api/multi/user/{username}`](https://www.saidit.net/dev/api/oauth#GET_api_multi_user_{username})                 | [`UserReference.listMultis()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/UserReference.kt#L101)                     |
| `GET`  | [`/api/multi/{multipath}`](https://www.saidit.net/dev/api/oauth#GET_api_multi_{multipath})                         | [`MultiredditReference.about()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L47)             |
| `GET`  | [`/api/multi/{multipath}/description`](https://www.saidit.net/dev/api/oauth#GET_api_multi_{multipath}_description) | [`MultiredditReference.description()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L55)       |
| `PUT`  | [`/api/multi/{multipath}/description`](https://www.saidit.net/dev/api/oauth#PUT_api_multi_{multipath}_description) | [`MultiredditReference.updateDescription()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L64) |
| `GET`  | [`/api/recommend/sr/{srnames}`](https://www.saidit.net/dev/api/oauth#GET_api_recommend_sr_{srnames})               | [`RedditClient.recommendedSubreddits()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/RedditClient.kt#L488)                       |
| `GET`  | [`/api/v1/user/{username}/trophies`](https://www.saidit.net/dev/api/oauth#GET_api_v1_user_{username}_trophies)     | [`UserReference.trophies()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/UserReference.kt#L54)                        |
| `GET`  | [`/subreddits/search`](https://www.saidit.net/dev/api/oauth#GET_subreddits_search)                                 | [`RedditClient.searchSubreddits()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/RedditClient.kt#L300)                            |
| `GET`  | [`/user/{username}/about`](https://www.saidit.net/dev/api/oauth#GET_user_{username}_about)                         | [`UserReference.query()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/UserReference.kt#L39)                           |
| `GET`  | [`[/s/{subreddit}]/about/log`](https://www.saidit.net/dev/api/oauth#GET_about_log)                                 | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/about/{location}`](https://www.saidit.net/dev/api/oauth#GET_about_{location})                   | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/about/{where}`](https://www.saidit.net/dev/api/oauth#GET_about_{where})                         | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/api/info`](https://www.saidit.net/dev/api/oauth#GET_api_info)                                   | None                                                                                                                                                                 |
| `GET`  | [`/api/multi/{multipath}/s/{srname}`](https://www.saidit.net/dev/api/oauth#GET_api_multi_{multipath}_s_{srname})   | None                                                                                                                                                                 |
| `GET`  | [`/api/subreddits_by_topic`](https://www.saidit.net/dev/api/oauth#GET_api_subreddits_by_topic)                     | None                                                                                                                                                                 |
| `GET`  | [`/by_id/{names}`](https://www.saidit.net/dev/api/oauth#GET_by_id_{names})                                         | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/comments/{article}`](https://www.saidit.net/dev/api/oauth#GET_comments_{article})               | None                                                                                                                                                                 |
| `GET`  | [`/duplicates/{article}`](https://www.saidit.net/dev/api/oauth#GET_duplicates_{article})                           | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/hot`](https://www.saidit.net/dev/api/oauth#GET_hot)                                             | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/new`](https://www.saidit.net/dev/api/oauth#GET_new)                                             | None                                                                                                                                                                 |
| `GET`  | [`/prefs/{where}`](https://www.saidit.net/dev/api/oauth#GET_prefs_{where})                                         | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/random`](https://www.saidit.net/dev/api/oauth#GET_random)                                       | None                                                                                                                                                                 |
| `GET`  | [`/s/{subreddit}/about`](https://www.saidit.net/dev/api/oauth#GET_s_{subreddit}_about)                             | None                                                                                                                                                                 |
| `GET`  | [`/s/{subreddit}/about/rules`](https://www.saidit.net/dev/api/oauth#GET_s_{subreddit}_about_rules)                 | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/search`](https://www.saidit.net/dev/api/oauth#GET_search)                                       | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/sidebar`](https://www.saidit.net/dev/api/oauth#GET_sidebar)                                     | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/sticky`](https://www.saidit.net/dev/api/oauth#GET_sticky)                                       | None                                                                                                                                                                 |
| `GET`  | [`/subs/{where}`](https://www.saidit.net/dev/api/oauth#GET_subs_{where})                                           | None                                                                                                                                                                 |
| `GET`  | [`[/s/{subreddit}]/{sort}`](https://www.saidit.net/dev/api/oauth#GET_{sort})                                       | None                                                                                                                                                                 |
| `POST` | [`/api/search_reddit_names`](https://www.saidit.net/dev/api/oauth#POST_api_search_reddit_names)                    | Not planned                                                                                                                                                          |

report
------

66.67% completion (2 implemented, 1 planned, and 0 not planned)

| Method | Endpoint                                                              | Implementation                                                                                                                                             |
|:------:| --------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `POST` | [`/api/hide`](https://www.saidit.net/dev/api/oauth#POST_api_hide)     | [`SubmissionReference.setHidden()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SubmissionReference.kt#L78) |
| `POST` | [`/api/unhide`](https://www.saidit.net/dev/api/oauth#POST_api_unhide) | [`SubmissionReference.setHidden()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SubmissionReference.kt#L78) |
| `POST` | [`/api/report`](https://www.saidit.net/dev/api/oauth#POST_api_report) | None                                                                                                                                                       |

save
----

100.00% completion (2 implemented, 1 planned, and 1 not planned)

| Method | Endpoint                                                                                 | Implementation                                                                                                                                                            |
|:------:| ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `POST` | [`/api/save`](https://www.saidit.net/dev/api/oauth#POST_api_save)                        | [`PublicContributionReference.setSaved()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L73) |
| `POST` | [`/api/unsave`](https://www.saidit.net/dev/api/oauth#POST_api_unsave)                    | [`PublicContributionReference.setSaved()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L73) |
| `GET`  | [`/api/saved_categories`](https://www.saidit.net/dev/api/oauth#GET_api_saved_categories) | None                                                                                                                                                                      |
| `POST` | [`/api/store_visits`](https://www.saidit.net/dev/api/oauth#POST_api_store_visits)        | Not planned                                                                                                                                                               |

submit
------

50.00% completion (1 implemented, 1 planned, and 0 not planned)

| Method | Endpoint                                                                                       | Implementation                                                                                                                                        |
|:------:| ---------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `POST` | [`/api/submit`](https://www.saidit.net/dev/api/oauth#POST_api_submit)                          | [`SubredditReference.submit()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SubredditReference.kt#L98) |
| `GET`  | [`[/s/{subreddit}]/api/submit_text`](https://www.saidit.net/dev/api/oauth#GET_api_submit_text) | None                                                                                                                                                  |

subscribe
---------

60.00% completion (6 implemented, 4 planned, and 0 not planned)

|  Method  | Endpoint                                                                                                            | Implementation                                                                                                                                                    |
|:--------:| ------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|  `POST`  | [`/api/multi/copy`](https://www.saidit.net/dev/api/oauth#POST_api_multi_copy)                                       | [`MultiredditReference.copyTo()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L88)         |
|  `POST`  | [`/api/multi/rename`](https://www.saidit.net/dev/api/oauth#POST_api_multi_rename)                                   | [`MultiredditReference.rename()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L96)         |
| `DELETE` | [`/api/multi/{multipath}`](https://www.saidit.net/dev/api/oauth#DELETE_api_multi_{multipath})                       | [`MultiredditReference.delete()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L76)         |
|  `POST`  | [`/api/multi/{multipath}`](https://www.saidit.net/dev/api/oauth#POST_api_multi_{multipath})                         | [`MultiredditReference.createOrUpdate()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L36) |
|  `PUT`   | [`/api/multi/{multipath}`](https://www.saidit.net/dev/api/oauth#PUT_api_multi_{multipath})                          | [`MultiredditReference.createOrUpdate()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/MultiredditReference.kt#L36) |
|  `POST`  | [`/api/subscribe`](https://www.saidit.net/dev/api/oauth#POST_api_subscribe)                                         | [`SubredditReference.setSubscribed()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/SubredditReference.kt#L142)     |
| `DELETE` | [`/api/multi/{multipath}/s/{srname}`](https://www.saidit.net/dev/api/oauth#DELETE_api_multi_{multipath}_s_{srname}) | None                                                                                                                                                              |
|  `PUT`   | [`/api/multi/{multipath}/s/{srname}`](https://www.saidit.net/dev/api/oauth#PUT_api_multi_{multipath}_s_{srname})    | None                                                                                                                                                              |
| `DELETE` | [`/api/v1/me/friends/{username}`](https://www.saidit.net/dev/api/oauth#DELETE_api_v1_me_friends_{username})         | None                                                                                                                                                              |
|  `PUT`   | [`/api/v1/me/friends/{username}`](https://www.saidit.net/dev/api/oauth#PUT_api_v1_me_friends_{username})            | None                                                                                                                                                              |

vote
----

100.00% completion (1 implemented, 0 planned, and 0 not planned)

| Method | Endpoint                                                          | Implementation                                                                                                                                                           |
|:------:| ----------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `POST` | [`/api/vote`](https://www.saidit.net/dev/api/oauth#POST_api_vote) | [`PublicContributionReference.setVote()`](https://github.com/mattbdean/JRAW/tree/master/lib/src/main/kotlin/net/dean/jraw/references/PublicContributionReference.kt#L47) |

wikiedit
--------

0.00% completion (0 implemented, 1 planned, and 0 not planned)

| Method | Endpoint                                                                                    | Implementation |
|:------:| ------------------------------------------------------------------------------------------- | -------------- |
| `POST` | [`[/s/{subreddit}]/api/wiki/edit`](https://www.saidit.net/dev/api/oauth#POST_api_wiki_edit) | None           |

wikiread
--------

0.00% completion (0 implemented, 5 planned, and 0 not planned)

| Method | Endpoint                                                                                                       | Implementation |
|:------:| -------------------------------------------------------------------------------------------------------------- | -------------- |
| `GET`  | [`[/s/{subreddit}]/wiki/discussions/{page}`](https://www.saidit.net/dev/api/oauth#GET_wiki_discussions_{page}) | None           |
| `GET`  | [`[/s/{subreddit}]/wiki/pages`](https://www.saidit.net/dev/api/oauth#GET_wiki_pages)                           | None           |
| `GET`  | [`[/s/{subreddit}]/wiki/revisions`](https://www.saidit.net/dev/api/oauth#GET_wiki_revisions)                   | None           |
| `GET`  | [`[/s/{subreddit}]/wiki/revisions/{page}`](https://www.saidit.net/dev/api/oauth#GET_wiki_revisions_{page})     | None           |
| `GET`  | [`[/s/{subreddit}]/wiki/{page}`](https://www.saidit.net/dev/api/oauth#GET_wiki_{page})                         | None           |

