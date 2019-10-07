package com.ansikt.springit.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class Vote {
    public Vote() {}

    @Id
    @GeneratedValue
    private Long id;
    private User user;
    private Link link;
    private int vote;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote1 = (Vote) o;
        return vote == vote1.vote &&
                Objects.equals(id, vote1.id) &&
                Objects.equals(user, vote1.user) &&
                Objects.equals(link, vote1.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, link, vote);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", user=" + user +
                ", link=" + link +
                ", vote=" + vote +
                '}';
    }
}
