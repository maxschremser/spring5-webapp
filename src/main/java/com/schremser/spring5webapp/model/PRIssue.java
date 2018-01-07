package com.schremser.spring5webapp.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Represents an Issue from the Problem Reporting.
 */
@Entity
public class PRIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne private BuildNote buildNote;
    @OneToOne private Issue issue;

    public PRIssue() {
    }

    public Long getId() {
        return id;
    }

    /*
    public void setId(Long id) {
        this.id = id;
    }
    */

    public BuildNote getBuildNote() {
        return buildNote;
    }

    public void setBuildNote(BuildNote buildNote) {
        this.buildNote = buildNote;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PRIssue prIssue = (PRIssue) o;
        return Objects.equals(id, prIssue.id);
    }

    @Override
    public int hashCode() {
        return id != null ? Objects.hash(id) : 0;
    }

    @Override
    public String toString() {
        return "PRIssue{" +
                "id=" + id +
                ", buildNote=" + buildNote +
                ", issue=" + issue +
                '}';
    }
}
