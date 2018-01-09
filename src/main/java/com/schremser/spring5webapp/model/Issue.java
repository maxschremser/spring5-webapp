package com.schremser.spring5webapp.model;

import javax.persistence.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Represents a Github Issue
 */
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String comment;
    private int estimate;
    private String release;
    private String epic;
    private String pipeline;

    @OneToMany(targetEntity = Attachment.class)
    private Set<Attachment> attachments;

    @OneToOne(targetEntity = Issue.class)
    private Set<Issue> dependencies;

    @OneToMany(targetEntity = Assignee.class)
    private Set<Assignee> assignees;

    @OneToMany(targetEntity = Label.class)
    private Set<Label> labels;

    @OneToMany(targetEntity = Project.class)
    private Set<Project> projects;

    public Issue() {
    }

    public Long getId() {
        return id;
    }

    /*
    public void setId(Long id) {
        this.id = id;
    }
    */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Set<Issue> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Set<Issue> dependencies) {
        this.dependencies = dependencies;
    }

    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public Set<Assignee> getAssignees() {
        return assignees;
    }

    public String getAssigneesAsString() {
        List<String> ass = new ArrayList<>();
        assignees.forEach(assignee -> {
            ass.add(assignee.getGithubUser());
        });
        return String.join(", ", ass);
    }

    public void setAssignees(Set<Assignee> assignees) {
        this.assignees = assignees;
    }

    public Set<Label> getLabels() {
        return labels;
    }

    public String getLabelsAsString() {
        List<String> labs = new ArrayList<>();
        labels.forEach(label -> {
            labs.add(label.getLabel());
        });
        return String.join(", ", labs);
    }

    public void setLabels(Set<Label> labels) {
        this.labels = labels;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(id, issue.id);
    }

    @Override
    public int hashCode() {
        return id != null ? Objects.hash(id) : 0;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                ", attachments=" + attachments +
                ", dependencies=" + dependencies +
                ", pipeline='" + pipeline + '\'' +
                ", assignees=" + assignees +
                ", labels=" + labels +
                ", projects=" + projects +
                ", estimate=" + estimate +
                ", release='" + release + '\'' +
                ", epic='" + epic + '\'' +
                '}';
    }
}
