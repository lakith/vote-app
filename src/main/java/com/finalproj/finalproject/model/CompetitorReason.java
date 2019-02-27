package com.finalproj.finalproject.model;

import javax.persistence.*;

@Entity
@Table(name="CompetitorReason")
public class CompetitorReason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int competitorReasonId;

    private String reason;

    public CompetitorReason() {
    }

    public int getCompetitorReasonId() {
        return competitorReasonId;
    }

    public void setCompetitorReasonId(int competitorReasonId) {
        this.competitorReasonId = competitorReasonId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
