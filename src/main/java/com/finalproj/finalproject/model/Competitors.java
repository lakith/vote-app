package com.finalproj.finalproject.model;

import javax.persistence.*;

@Entity
@Table(name = "competitor")
public class Competitors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int competitorId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_compt_id")
    private  Department department;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compt_id")
    private User user;

    private int votes;

    public Competitors() {
    }

    public int getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(int competitorId) {
        this.competitorId = competitorId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
