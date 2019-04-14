package net.dean.jraw.models;

import com.fasterxml.jackson.databind.JsonNode;
import net.dean.jraw.models.meta.JsonProperty;
import net.dean.jraw.models.meta.Model;

/**
 * This class represents a message that appears in a user's inbox because another user has replied to his or her comment.
 */
@Model(kind = Model.Kind.COMMENT)
public final class CommentMessage extends Message {
    /**
     * Instantiates a new CommentMessage
     */
    public CommentMessage(JsonNode dataNode) {
        super(dataNode);
    }

    /** Gets the title of the link this comment was posted in */
    @JsonProperty
    public String getLinkTitle() {
        return data("link_title");
    }

    /** Gets the way the logged in user voted on the comment that this message represents. */
    @JsonProperty(nullable = true)
    public VoteState getVote() {
        JsonNode likes = getDataNode().get("likes");
        boolean likesState = !likes.isNull() && likes.booleanValue();
        JsonNode dislikes = getDataNode().get("dislikes");
        boolean dislikesState = !dislikes.isNull() && dislikes.booleanValue();

        return VoteState.of(likesState, dislikesState);
    }
}
