package com.schremser.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Assignee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String githubUser;
    private String prUser;
    private String email;

    public Assignee() {
    }

    public Long getId() {
        return id;
    }

/*
    public void setId(Long id) {
        this.id = id;
    }
*/

    public String getGithubUser() {
        return githubUser;
    }

    public void setGithubUser(String githubUser) {
        this.githubUser = githubUser;
    }

    public String getPrUser() {
        return prUser;
    }

    public void setPrUser(String prUser) {
        this.prUser = prUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignee assignee = (Assignee) o;
        return Objects.equals(id, assignee.id);
    }

    @Override
    public int hashCode() {
        return id != null ? Objects.hash(id) : 0;
    }

    @Override
    public String toString() {
        return "Assignee{" +
                "id=" + id +
                ", githubUser='" + githubUser + '\'' +
                ", prUser='" + prUser + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
