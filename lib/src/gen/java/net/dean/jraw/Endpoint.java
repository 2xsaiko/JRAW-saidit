package net.dean.jraw;

import static net.dean.jraw.Endpoint.Constant.OPTIONAL_SUBREDDIT;

/**
 * This is a dynamically generated enumeration of all reddit API endpoints.
 *
 * For JRAW developers: this class should not be edited by hand. This class can be regenerated through the {@code :meta:update} Gradle task. */
public enum Endpoint {
    /**
     * Represents the endpoint {@code POST /api/comment}. Requires OAuth scope 'any'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_comment">here</a> for more information */
    POST_COMMENT("POST", "/api/comment", "any"),

    /**
     * Represents the endpoint {@code POST /api/friend}. Requires OAuth scope 'any'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_friend">here</a> for more information */
    POST_FRIEND("POST", OPTIONAL_SUBREDDIT + "/api/friend", "any"),

    /**
     * Represents the endpoint {@code GET /api/needs_captcha}. Requires OAuth scope 'any'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_needs_captcha">here</a> for more information */
    GET_NEEDS_CAPTCHA("GET", "/api/needs_captcha", "any"),

    /**
     * Represents the endpoint {@code POST /api/new_captcha}. Requires OAuth scope 'any'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_new_captcha">here</a> for more information */
    POST_NEW_CAPTCHA("POST", "/api/new_captcha", "any"),

    /**
     * Represents the endpoint {@code POST /api/unfriend}. Requires OAuth scope 'any'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unfriend">here</a> for more information */
    POST_UNFRIEND("POST", OPTIONAL_SUBREDDIT + "/api/unfriend", "any"),

    /**
     * Represents the endpoint {@code GET /api/v1/scopes}. Requires OAuth scope 'any'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_v1_scopes">here</a> for more information */
    GET_SCOPES("GET", "/api/v1/scopes", "any"),

    /**
     * Represents the endpoint {@code GET /captcha/{iden}}. Requires OAuth scope 'any'. See <a href="https://www.saidit.net/dev/api/oauth#GET_captcha_{iden}">here</a> for more information */
    GET_CAPTCHA_IDEN("GET", "/captcha/{iden}", "any"),

    /**
     * Represents the endpoint {@code PATCH /api/v1/me/prefs}. Requires OAuth scope 'account'. See <a href="https://www.saidit.net/dev/api/oauth#PATCH_api_v1_me_prefs">here</a> for more information */
    PATCH_ME_PREFS("PATCH", "/api/v1/me/prefs", "account"),

    /**
     * Represents the endpoint {@code POST /api/v1/gold/gild/{fullname}}. Requires OAuth scope 'creddits'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_v1_gold_gild_{fullname}">here</a> for more information */
    POST_GOLD_GILD_FULLNAME("POST", "/api/v1/gold/gild/{fullname}", "creddits"),

    /**
     * Represents the endpoint {@code POST /api/v1/gold/give/{username}}. Requires OAuth scope 'creddits'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_v1_gold_give_{username}">here</a> for more information */
    POST_GOLD_GIVE_USERNAME("POST", "/api/v1/gold/give/{username}", "creddits"),

    /**
     * Represents the endpoint {@code POST /api/del}. Requires OAuth scope 'edit'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_del">here</a> for more information */
    POST_DEL("POST", "/api/del", "edit"),

    /**
     * Represents the endpoint {@code POST /api/editusertext}. Requires OAuth scope 'edit'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_editusertext">here</a> for more information */
    POST_EDITUSERTEXT("POST", "/api/editusertext", "edit"),

    /**
     * Represents the endpoint {@code POST /api/sendreplies}. Requires OAuth scope 'edit'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_sendreplies">here</a> for more information */
    POST_SENDREPLIES("POST", "/api/sendreplies", "edit"),

    /**
     * Represents the endpoint {@code POST /api/flairselector}. Requires OAuth scope 'flair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_flairselector">here</a> for more information */
    POST_FLAIRSELECTOR("POST", OPTIONAL_SUBREDDIT + "/api/flairselector", "flair"),

    /**
     * Represents the endpoint {@code POST /api/selectflair}. Requires OAuth scope 'flair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_selectflair">here</a> for more information */
    POST_SELECTFLAIR("POST", OPTIONAL_SUBREDDIT + "/api/selectflair", "flair"),

    /**
     * Represents the endpoint {@code POST /api/setflairenabled}. Requires OAuth scope 'flair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_setflairenabled">here</a> for more information */
    POST_SETFLAIRENABLED("POST", OPTIONAL_SUBREDDIT + "/api/setflairenabled", "flair"),

    /**
     * Represents the endpoint {@code GET /user/{username}/{where}}. Requires OAuth scope 'history'. See <a href="https://www.saidit.net/dev/api/oauth#GET_user_{username}_{where}">here</a> for more information */
    GET_USER_USERNAME_WHERE("GET", "/user/{username}/{where}", "history"),

    /**
     * Represents the endpoint {@code GET /api/v1/me}. Requires OAuth scope 'identity'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_v1_me">here</a> for more information */
    GET_ME("GET", "/api/v1/me", "identity"),

    /**
     * Represents the endpoint {@code GET /api/v1/me/prefs}. Requires OAuth scope 'identity'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_v1_me_prefs">here</a> for more information */
    GET_ME_PREFS("GET", "/api/v1/me/prefs", "identity"),

    /**
     * Represents the endpoint {@code GET /api/v1/me/trophies}. Requires OAuth scope 'identity'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_v1_me_trophies">here</a> for more information */
    GET_ME_TROPHIES("GET", "/api/v1/me/trophies", "identity"),

    /**
     * Represents the endpoint {@code POST /api/delete_sr_banner}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_banner">here</a> for more information */
    POST_DELETE_SR_BANNER("POST", OPTIONAL_SUBREDDIT + "/api/delete_sr_banner", "modconfig"),

    /**
     * Represents the endpoint {@code POST /api/delete_sr_header}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_header">here</a> for more information */
    POST_DELETE_SR_HEADER("POST", OPTIONAL_SUBREDDIT + "/api/delete_sr_header", "modconfig"),

    /**
     * Represents the endpoint {@code POST /api/delete_sr_icon}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_icon">here</a> for more information */
    POST_DELETE_SR_ICON("POST", OPTIONAL_SUBREDDIT + "/api/delete_sr_icon", "modconfig"),

    /**
     * Represents the endpoint {@code POST /api/delete_sr_img}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_delete_sr_img">here</a> for more information */
    POST_DELETE_SR_IMG("POST", OPTIONAL_SUBREDDIT + "/api/delete_sr_img", "modconfig"),

    /**
     * Represents the endpoint {@code POST /api/site_admin}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_site_admin">here</a> for more information */
    POST_SITE_ADMIN("POST", "/api/site_admin", "modconfig"),

    /**
     * Represents the endpoint {@code POST /api/subreddit_stylesheet}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_subreddit_stylesheet">here</a> for more information */
    POST_SUBREDDIT_STYLESHEET("POST", OPTIONAL_SUBREDDIT + "/api/subreddit_stylesheet", "modconfig"),

    /**
     * Represents the endpoint {@code POST /api/upload_sr_img}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_upload_sr_img">here</a> for more information */
    POST_UPLOAD_SR_IMG("POST", OPTIONAL_SUBREDDIT + "/api/upload_sr_img", "modconfig"),

    /**
     * Represents the endpoint {@code GET /s/{subreddit}/about/edit}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#GET_s_{subreddit}_about_edit">here</a> for more information */
    GET_SUBREDDIT_ABOUT_EDIT("GET", "/s/{subreddit}/about/edit", "modconfig"),

    /**
     * Represents the endpoint {@code GET /stylesheet}. Requires OAuth scope 'modconfig'. See <a href="https://www.saidit.net/dev/api/oauth#GET_stylesheet">here</a> for more information */
    GET_STYLESHEET("GET", OPTIONAL_SUBREDDIT + "/stylesheet", "modconfig"),

    /**
     * Represents the endpoint {@code POST /api/mute_message_author}. Requires OAuth scope 'modcontributors'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_mute_message_author">here</a> for more information */
    POST_MUTE_MESSAGE_AUTHOR("POST", "/api/mute_message_author", "modcontributors"),

    /**
     * Represents the endpoint {@code POST /api/unmute_message_author}. Requires OAuth scope 'modcontributors'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unmute_message_author">here</a> for more information */
    POST_UNMUTE_MESSAGE_AUTHOR("POST", "/api/unmute_message_author", "modcontributors"),

    /**
     * Represents the endpoint {@code POST /api/clearflairtemplates}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_clearflairtemplates">here</a> for more information */
    POST_CLEARFLAIRTEMPLATES("POST", OPTIONAL_SUBREDDIT + "/api/clearflairtemplates", "modflair"),

    /**
     * Represents the endpoint {@code POST /api/deleteflair}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_deleteflair">here</a> for more information */
    POST_DELETEFLAIR("POST", OPTIONAL_SUBREDDIT + "/api/deleteflair", "modflair"),

    /**
     * Represents the endpoint {@code POST /api/deleteflairtemplate}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_deleteflairtemplate">here</a> for more information */
    POST_DELETEFLAIRTEMPLATE("POST", OPTIONAL_SUBREDDIT + "/api/deleteflairtemplate", "modflair"),

    /**
     * Represents the endpoint {@code POST /api/flair}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_flair">here</a> for more information */
    POST_FLAIR("POST", OPTIONAL_SUBREDDIT + "/api/flair", "modflair"),

    /**
     * Represents the endpoint {@code POST /api/flairconfig}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_flairconfig">here</a> for more information */
    POST_FLAIRCONFIG("POST", OPTIONAL_SUBREDDIT + "/api/flairconfig", "modflair"),

    /**
     * Represents the endpoint {@code POST /api/flaircsv}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_flaircsv">here</a> for more information */
    POST_FLAIRCSV("POST", OPTIONAL_SUBREDDIT + "/api/flaircsv", "modflair"),

    /**
     * Represents the endpoint {@code GET /api/flairlist}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_flairlist">here</a> for more information */
    GET_FLAIRLIST("GET", OPTIONAL_SUBREDDIT + "/api/flairlist", "modflair"),

    /**
     * Represents the endpoint {@code POST /api/flairtemplate}. Requires OAuth scope 'modflair'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_flairtemplate">here</a> for more information */
    POST_FLAIRTEMPLATE("POST", OPTIONAL_SUBREDDIT + "/api/flairtemplate", "modflair"),

    /**
     * Represents the endpoint {@code POST /api/setpermissions}. Requires OAuth scope 'modothers'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_setpermissions">here</a> for more information */
    POST_SETPERMISSIONS("POST", OPTIONAL_SUBREDDIT + "/api/setpermissions", "modothers"),

    /**
     * Represents the endpoint {@code POST /api/approve}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_approve">here</a> for more information */
    POST_APPROVE("POST", "/api/approve", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/distinguish}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_distinguish">here</a> for more information */
    POST_DISTINGUISH("POST", "/api/distinguish", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/ignore_reports}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_ignore_reports">here</a> for more information */
    POST_IGNORE_REPORTS("POST", "/api/ignore_reports", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/lock}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_lock">here</a> for more information */
    POST_LOCK("POST", "/api/lock", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/marknsfw}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_marknsfw">here</a> for more information */
    POST_MARKNSFW("POST", "/api/marknsfw", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/remove}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_remove">here</a> for more information */
    POST_REMOVE("POST", "/api/remove", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/set_contest_mode}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_set_contest_mode">here</a> for more information */
    POST_SET_CONTEST_MODE("POST", "/api/set_contest_mode", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/set_subreddit_sticky}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_set_subreddit_sticky">here</a> for more information */
    POST_SET_SUBREDDIT_STICKY("POST", "/api/set_subreddit_sticky", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/set_suggested_sort}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_set_suggested_sort">here</a> for more information */
    POST_SET_SUGGESTED_SORT("POST", "/api/set_suggested_sort", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/unignore_reports}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unignore_reports">here</a> for more information */
    POST_UNIGNORE_REPORTS("POST", "/api/unignore_reports", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/unlock}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unlock">here</a> for more information */
    POST_UNLOCK("POST", "/api/unlock", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/unmarknsfw}. Requires OAuth scope 'modposts'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unmarknsfw">here</a> for more information */
    POST_UNMARKNSFW("POST", "/api/unmarknsfw", "modposts"),

    /**
     * Represents the endpoint {@code POST /api/accept_moderator_invite}. Requires OAuth scope 'modself'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_accept_moderator_invite">here</a> for more information */
    POST_ACCEPT_MODERATOR_INVITE("POST", OPTIONAL_SUBREDDIT + "/api/accept_moderator_invite", "modself"),

    /**
     * Represents the endpoint {@code POST /api/leavecontributor}. Requires OAuth scope 'modself'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_leavecontributor">here</a> for more information */
    POST_LEAVECONTRIBUTOR("POST", "/api/leavecontributor", "modself"),

    /**
     * Represents the endpoint {@code POST /api/leavemoderator}. Requires OAuth scope 'modself'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_leavemoderator">here</a> for more information */
    POST_LEAVEMODERATOR("POST", "/api/leavemoderator", "modself"),

    /**
     * Represents the endpoint {@code POST /api/wiki/alloweditor/{act}}. Requires OAuth scope 'modwiki'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_wiki_alloweditor_{act}">here</a> for more information */
    POST_WIKI_ALLOWEDITOR_ACT("POST", OPTIONAL_SUBREDDIT + "/api/wiki/alloweditor/{act}", "modwiki"),

    /**
     * Represents the endpoint {@code POST /api/wiki/hide}. Requires OAuth scope 'modwiki'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_wiki_hide">here</a> for more information */
    POST_WIKI_HIDE("POST", OPTIONAL_SUBREDDIT + "/api/wiki/hide", "modwiki"),

    /**
     * Represents the endpoint {@code POST /api/wiki/revert}. Requires OAuth scope 'modwiki'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_wiki_revert">here</a> for more information */
    POST_WIKI_REVERT("POST", OPTIONAL_SUBREDDIT + "/api/wiki/revert", "modwiki"),

    /**
     * Represents the endpoint {@code GET /wiki/settings/{page}}. Requires OAuth scope 'modwiki'. See <a href="https://www.saidit.net/dev/api/oauth#GET_wiki_settings_{page}">here</a> for more information */
    GET_WIKI_SETTINGS_PAGE("GET", OPTIONAL_SUBREDDIT + "/wiki/settings/{page}", "modwiki"),

    /**
     * Represents the endpoint {@code POST /wiki/settings/{page}}. Requires OAuth scope 'modwiki'. See <a href="https://www.saidit.net/dev/api/oauth#POST_wiki_settings_{page}">here</a> for more information */
    POST_WIKI_SETTINGS_PAGE("POST", OPTIONAL_SUBREDDIT + "/wiki/settings/{page}", "modwiki"),

    /**
     * Represents the endpoint {@code GET /api/v1/me/friends/{username}}. Requires OAuth scope 'mysubreddits'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_v1_me_friends_{username}">here</a> for more information */
    GET_ME_FRIENDS_USERNAME("GET", "/api/v1/me/friends/{username}", "mysubreddits"),

    /**
     * Represents the endpoint {@code GET /api/v1/me/karma}. Requires OAuth scope 'mysubreddits'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_v1_me_karma">here</a> for more information */
    GET_ME_KARMA("GET", "/api/v1/me/karma", "mysubreddits"),

    /**
     * Represents the endpoint {@code GET /subs/mine/{where}}. Requires OAuth scope 'mysubreddits'. See <a href="https://www.saidit.net/dev/api/oauth#GET_subs_mine_{where}">here</a> for more information */
    GET_SUBS_MINE_WHERE("GET", "/subs/mine/{where}", "mysubreddits"),

    /**
     * Represents the endpoint {@code POST /api/block}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_block">here</a> for more information */
    POST_BLOCK("POST", "/api/block", "privatemessages"),

    /**
     * Represents the endpoint {@code POST /api/compose}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_compose">here</a> for more information */
    POST_COMPOSE("POST", "/api/compose", "privatemessages"),

    /**
     * Represents the endpoint {@code POST /api/del_msg}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_del_msg">here</a> for more information */
    POST_DEL_MSG("POST", "/api/del_msg", "privatemessages"),

    /**
     * Represents the endpoint {@code POST /api/read_all_messages}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_read_all_messages">here</a> for more information */
    POST_READ_ALL_MESSAGES("POST", "/api/read_all_messages", "privatemessages"),

    /**
     * Represents the endpoint {@code POST /api/read_message}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_read_message">here</a> for more information */
    POST_READ_MESSAGE("POST", "/api/read_message", "privatemessages"),

    /**
     * Represents the endpoint {@code POST /api/unblock_subreddit}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unblock_subreddit">here</a> for more information */
    POST_UNBLOCK_SUBREDDIT("POST", "/api/unblock_subreddit", "privatemessages"),

    /**
     * Represents the endpoint {@code POST /api/unread_message}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unread_message">here</a> for more information */
    POST_UNREAD_MESSAGE("POST", "/api/unread_message", "privatemessages"),

    /**
     * Represents the endpoint {@code GET /message/{where}}. Requires OAuth scope 'privatemessages'. See <a href="https://www.saidit.net/dev/api/oauth#GET_message_{where}">here</a> for more information */
    GET_MESSAGE_WHERE("GET", "/message/{where}", "privatemessages"),

    /**
     * Represents the endpoint {@code GET /about/log}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_about_log">here</a> for more information */
    GET_ABOUT_LOG("GET", OPTIONAL_SUBREDDIT + "/about/log", "read"),

    /**
     * Represents the endpoint {@code GET /about/{location}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_about_{location}">here</a> for more information */
    GET_ABOUT_LOCATION("GET", OPTIONAL_SUBREDDIT + "/about/{location}", "read"),

    /**
     * Represents the endpoint {@code GET /about/{where}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_about_{where}">here</a> for more information */
    GET_ABOUT_WHERE("GET", OPTIONAL_SUBREDDIT + "/about/{where}", "read"),

    /**
     * Represents the endpoint {@code GET /api/info}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_info">here</a> for more information */
    GET_INFO("GET", OPTIONAL_SUBREDDIT + "/api/info", "read"),

    /**
     * Represents the endpoint {@code GET /api/morechildren}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_morechildren">here</a> for more information */
    GET_MORECHILDREN("GET", "/api/morechildren", "read"),

    /**
     * Represents the endpoint {@code GET /api/multi/mine}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_multi_mine">here</a> for more information */
    GET_MULTI_MINE("GET", "/api/multi/mine", "read"),

    /**
     * Represents the endpoint {@code GET /api/multi/user/{username}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_multi_user_{username}">here</a> for more information */
    GET_MULTI_USER_USERNAME("GET", "/api/multi/user/{username}", "read"),

    /**
     * Represents the endpoint {@code GET /api/multi/{multipath}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_multi_{multipath}">here</a> for more information */
    GET_MULTI_MULTIPATH("GET", "/api/multi/{multipath}", "read"),

    /**
     * Represents the endpoint {@code GET /api/multi/{multipath}/description}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_multi_{multipath}_description">here</a> for more information */
    GET_MULTI_MULTIPATH_DESCRIPTION("GET", "/api/multi/{multipath}/description", "read"),

    /**
     * Represents the endpoint {@code PUT /api/multi/{multipath}/description}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#PUT_api_multi_{multipath}_description">here</a> for more information */
    PUT_MULTI_MULTIPATH_DESCRIPTION("PUT", "/api/multi/{multipath}/description", "read"),

    /**
     * Represents the endpoint {@code GET /api/multi/{multipath}/s/{srname}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_multi_{multipath}_s_{srname}">here</a> for more information */
    GET_MULTI_MULTIPATH_S_SRNAME("GET", "/api/multi/{multipath}/s/{srname}", "read"),

    /**
     * Represents the endpoint {@code GET /api/recommend/sr/{srnames}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_recommend_sr_{srnames}">here</a> for more information */
    GET_RECOMMEND_SR_SRNAMES("GET", "/api/recommend/sr/{srnames}", "read"),

    /**
     * Represents the endpoint {@code POST /api/search_reddit_names}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_search_reddit_names">here</a> for more information */
    POST_SEARCH_REDDIT_NAMES("POST", "/api/search_reddit_names", "read"),

    /**
     * Represents the endpoint {@code GET /api/subreddits_by_topic}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_subreddits_by_topic">here</a> for more information */
    GET_SUBREDDITS_BY_TOPIC("GET", "/api/subreddits_by_topic", "read"),

    /**
     * Represents the endpoint {@code GET /api/v1/user/{username}/trophies}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_v1_user_{username}_trophies">here</a> for more information */
    GET_USER_USERNAME_TROPHIES("GET", "/api/v1/user/{username}/trophies", "read"),

    /**
     * Represents the endpoint {@code GET /by_id/{names}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_by_id_{names}">here</a> for more information */
    GET_BY_ID_NAMES("GET", "/by_id/{names}", "read"),

    /**
     * Represents the endpoint {@code GET /comments/{article}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_comments_{article}">here</a> for more information */
    GET_COMMENTS_ARTICLE("GET", OPTIONAL_SUBREDDIT + "/comments/{article}", "read"),

    /**
     * Represents the endpoint {@code GET /duplicates/{article}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_duplicates_{article}">here</a> for more information */
    GET_DUPLICATES_ARTICLE("GET", "/duplicates/{article}", "read"),

    /**
     * Represents the endpoint {@code GET /hot}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_hot">here</a> for more information */
    GET_HOT("GET", OPTIONAL_SUBREDDIT + "/hot", "read"),

    /**
     * Represents the endpoint {@code GET /new}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_new">here</a> for more information */
    GET_NEW("GET", OPTIONAL_SUBREDDIT + "/new", "read"),

    /**
     * Represents the endpoint {@code GET /prefs/{where}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_prefs_{where}">here</a> for more information */
    GET_PREFS_WHERE("GET", "/prefs/{where}", "read"),

    /**
     * Represents the endpoint {@code GET /random}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_random">here</a> for more information */
    GET_RANDOM("GET", OPTIONAL_SUBREDDIT + "/random", "read"),

    /**
     * Represents the endpoint {@code GET /s/{subreddit}/about}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_s_{subreddit}_about">here</a> for more information */
    GET_SUBREDDIT_ABOUT("GET", "/s/{subreddit}/about", "read"),

    /**
     * Represents the endpoint {@code GET /s/{subreddit}/about/rules}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_s_{subreddit}_about_rules">here</a> for more information */
    GET_SUBREDDIT_ABOUT_RULES("GET", "/s/{subreddit}/about/rules", "read"),

    /**
     * Represents the endpoint {@code GET /search}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_search">here</a> for more information */
    GET_SEARCH("GET", OPTIONAL_SUBREDDIT + "/search", "read"),

    /**
     * Represents the endpoint {@code GET /sidebar}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_sidebar">here</a> for more information */
    GET_SIDEBAR("GET", OPTIONAL_SUBREDDIT + "/sidebar", "read"),

    /**
     * Represents the endpoint {@code GET /sticky}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_sticky">here</a> for more information */
    GET_STICKY("GET", OPTIONAL_SUBREDDIT + "/sticky", "read"),

    /**
     * Represents the endpoint {@code GET /subreddits/search}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_subreddits_search">here</a> for more information */
    GET_SUBREDDITS_SEARCH("GET", "/subreddits/search", "read"),

    /**
     * Represents the endpoint {@code GET /subs/{where}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_subs_{where}">here</a> for more information */
    GET_SUBS_WHERE("GET", "/subs/{where}", "read"),

    /**
     * Represents the endpoint {@code GET /user/{username}/about}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_user_{username}_about">here</a> for more information */
    GET_USER_USERNAME_ABOUT("GET", "/user/{username}/about", "read"),

    /**
     * Represents the endpoint {@code GET /{sort}}. Requires OAuth scope 'read'. See <a href="https://www.saidit.net/dev/api/oauth#GET_{sort}">here</a> for more information */
    GET_SORT("GET", OPTIONAL_SUBREDDIT + "/{sort}", "read"),

    /**
     * Represents the endpoint {@code POST /api/hide}. Requires OAuth scope 'report'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_hide">here</a> for more information */
    POST_HIDE("POST", "/api/hide", "report"),

    /**
     * Represents the endpoint {@code POST /api/report}. Requires OAuth scope 'report'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_report">here</a> for more information */
    POST_REPORT("POST", "/api/report", "report"),

    /**
     * Represents the endpoint {@code POST /api/unhide}. Requires OAuth scope 'report'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unhide">here</a> for more information */
    POST_UNHIDE("POST", "/api/unhide", "report"),

    /**
     * Represents the endpoint {@code POST /api/save}. Requires OAuth scope 'save'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_save">here</a> for more information */
    POST_SAVE("POST", "/api/save", "save"),

    /**
     * Represents the endpoint {@code GET /api/saved_categories}. Requires OAuth scope 'save'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_saved_categories">here</a> for more information */
    GET_SAVED_CATEGORIES("GET", "/api/saved_categories", "save"),

    /**
     * Represents the endpoint {@code POST /api/store_visits}. Requires OAuth scope 'save'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_store_visits">here</a> for more information */
    POST_STORE_VISITS("POST", "/api/store_visits", "save"),

    /**
     * Represents the endpoint {@code POST /api/unsave}. Requires OAuth scope 'save'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_unsave">here</a> for more information */
    POST_UNSAVE("POST", "/api/unsave", "save"),

    /**
     * Represents the endpoint {@code POST /api/submit}. Requires OAuth scope 'submit'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_submit">here</a> for more information */
    POST_SUBMIT("POST", "/api/submit", "submit"),

    /**
     * Represents the endpoint {@code GET /api/submit_text}. Requires OAuth scope 'submit'. See <a href="https://www.saidit.net/dev/api/oauth#GET_api_submit_text">here</a> for more information */
    GET_SUBMIT_TEXT("GET", OPTIONAL_SUBREDDIT + "/api/submit_text", "submit"),

    /**
     * Represents the endpoint {@code POST /api/multi/copy}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_multi_copy">here</a> for more information */
    POST_MULTI_COPY("POST", "/api/multi/copy", "subscribe"),

    /**
     * Represents the endpoint {@code POST /api/multi/rename}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_multi_rename">here</a> for more information */
    POST_MULTI_RENAME("POST", "/api/multi/rename", "subscribe"),

    /**
     * Represents the endpoint {@code DELETE /api/multi/{multipath}}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#DELETE_api_multi_{multipath}">here</a> for more information */
    DELETE_MULTI_MULTIPATH("DELETE", "/api/multi/{multipath}", "subscribe"),

    /**
     * Represents the endpoint {@code POST /api/multi/{multipath}}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_multi_{multipath}">here</a> for more information */
    POST_MULTI_MULTIPATH("POST", "/api/multi/{multipath}", "subscribe"),

    /**
     * Represents the endpoint {@code PUT /api/multi/{multipath}}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#PUT_api_multi_{multipath}">here</a> for more information */
    PUT_MULTI_MULTIPATH("PUT", "/api/multi/{multipath}", "subscribe"),

    /**
     * Represents the endpoint {@code DELETE /api/multi/{multipath}/s/{srname}}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#DELETE_api_multi_{multipath}_s_{srname}">here</a> for more information */
    DELETE_MULTI_MULTIPATH_S_SRNAME("DELETE", "/api/multi/{multipath}/s/{srname}", "subscribe"),

    /**
     * Represents the endpoint {@code PUT /api/multi/{multipath}/s/{srname}}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#PUT_api_multi_{multipath}_s_{srname}">here</a> for more information */
    PUT_MULTI_MULTIPATH_S_SRNAME("PUT", "/api/multi/{multipath}/s/{srname}", "subscribe"),

    /**
     * Represents the endpoint {@code POST /api/subscribe}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_subscribe">here</a> for more information */
    POST_SUBSCRIBE("POST", "/api/subscribe", "subscribe"),

    /**
     * Represents the endpoint {@code DELETE /api/v1/me/friends/{username}}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#DELETE_api_v1_me_friends_{username}">here</a> for more information */
    DELETE_ME_FRIENDS_USERNAME("DELETE", "/api/v1/me/friends/{username}", "subscribe"),

    /**
     * Represents the endpoint {@code PUT /api/v1/me/friends/{username}}. Requires OAuth scope 'subscribe'. See <a href="https://www.saidit.net/dev/api/oauth#PUT_api_v1_me_friends_{username}">here</a> for more information */
    PUT_ME_FRIENDS_USERNAME("PUT", "/api/v1/me/friends/{username}", "subscribe"),

    /**
     * Represents the endpoint {@code POST /api/vote}. Requires OAuth scope 'vote'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_vote">here</a> for more information */
    POST_VOTE("POST", "/api/vote", "vote"),

    /**
     * Represents the endpoint {@code POST /api/wiki/edit}. Requires OAuth scope 'wikiedit'. See <a href="https://www.saidit.net/dev/api/oauth#POST_api_wiki_edit">here</a> for more information */
    POST_WIKI_EDIT("POST", OPTIONAL_SUBREDDIT + "/api/wiki/edit", "wikiedit"),

    /**
     * Represents the endpoint {@code GET /wiki/discussions/{page}}. Requires OAuth scope 'wikiread'. See <a href="https://www.saidit.net/dev/api/oauth#GET_wiki_discussions_{page}">here</a> for more information */
    GET_WIKI_DISCUSSIONS_PAGE("GET", OPTIONAL_SUBREDDIT + "/wiki/discussions/{page}", "wikiread"),

    /**
     * Represents the endpoint {@code GET /wiki/pages}. Requires OAuth scope 'wikiread'. See <a href="https://www.saidit.net/dev/api/oauth#GET_wiki_pages">here</a> for more information */
    GET_WIKI_PAGES("GET", OPTIONAL_SUBREDDIT + "/wiki/pages", "wikiread"),

    /**
     * Represents the endpoint {@code GET /wiki/revisions}. Requires OAuth scope 'wikiread'. See <a href="https://www.saidit.net/dev/api/oauth#GET_wiki_revisions">here</a> for more information */
    GET_WIKI_REVISIONS("GET", OPTIONAL_SUBREDDIT + "/wiki/revisions", "wikiread"),

    /**
     * Represents the endpoint {@code GET /wiki/revisions/{page}}. Requires OAuth scope 'wikiread'. See <a href="https://www.saidit.net/dev/api/oauth#GET_wiki_revisions_{page}">here</a> for more information */
    GET_WIKI_REVISIONS_PAGE("GET", OPTIONAL_SUBREDDIT + "/wiki/revisions/{page}", "wikiread"),

    /**
     * Represents the endpoint {@code GET /wiki/{page}}. Requires OAuth scope 'wikiread'. See <a href="https://www.saidit.net/dev/api/oauth#GET_wiki_{page}">here</a> for more information */
    GET_WIKI_PAGE("GET", OPTIONAL_SUBREDDIT + "/wiki/{page}", "wikiread");

    private final String method;

    private final String path;

    private final String scope;

    Endpoint(final String method, final String path, final String scope) {
        this.method = method;
        this.path = path;
        this.scope = scope;
    }

    /**
     * Gets this Endpoint's path, e.g. {@code /api/comment} */
    public String getPath() {
        return this.path;
    }

    /**
     * Gets this Endpoint's HTTP method ("GET", "POST", etc.) */
    public String getMethod() {
        return this.method;
    }

    /**
     * Gets the OAuth2 scope required to use this endpoint */
    public String getScope() {
        return this.scope;
    }

    public static class Constant {
        public static final String OPTIONAL_SUBREDDIT = "[/s/{subreddit}]";
    }
}
