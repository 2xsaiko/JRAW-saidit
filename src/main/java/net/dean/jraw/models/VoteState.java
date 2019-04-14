package net.dean.jraw.models;

import java.util.Objects;

public class VoteState {

    private static final VoteState[] values = {
        new VoteState(false, false),
        new VoteState(false, true),
        new VoteState(true, false),
        new VoteState(true, true),
    };

    public final boolean insightful;
    public final boolean fun;

    private VoteState(boolean insightful, boolean fun) {
        this.insightful = insightful;
        this.fun = fun;
    }

    public VoteState withInsightful(boolean insightful) {
        return VoteState.of(insightful, fun);
    }

    public VoteState withFun(boolean fun) {
        return VoteState.of(insightful, fun);
    }

    public static VoteState none() {
        return VoteState.of(false, false);
    }

    public static VoteState of(boolean insightful, boolean fun) {
        return VoteState.values[(insightful ? 2 : 0) | (fun ? 1 : 0)];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoteState voteState = (VoteState) o;
        return insightful == voteState.insightful &&
            fun == voteState.fun;
    }

    @Override
    public int hashCode() {
        return Objects.hash(insightful, fun);
    }

    @Override
    public String toString() {
        return String.format("VoteState { insightful: %s, fun: %s }", insightful, fun);
    }

}
