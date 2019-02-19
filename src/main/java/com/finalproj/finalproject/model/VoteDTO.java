package com.finalproj.finalproject.model;

public class VoteDTO {

    private int userId;

    private int competitorId;

    public VoteDTO() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(int competitorId) {
        this.competitorId = competitorId;
    }
}
