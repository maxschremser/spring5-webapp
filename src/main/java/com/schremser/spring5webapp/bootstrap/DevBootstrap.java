package com.schremser.spring5webapp.bootstrap;

import com.schremser.spring5webapp.model.Assignee;
import com.schremser.spring5webapp.model.Issue;
import com.schremser.spring5webapp.model.Label;
import com.schremser.spring5webapp.repository.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AssigneeRepository assigneeRepository;
    private AttachmentRepository attachmentRepository;
    private BuildNoteRepository buildNoteRepository;
    private IssueRepository issueRepository;
    private LabelRepository labelRepository;
    private PRIssueRepository prIssueRepository;
    private ProjectRepository projectRepository;

    public DevBootstrap(AssigneeRepository assigneeRepository, AttachmentRepository attachmentRepository, BuildNoteRepository buildNoteRepository, IssueRepository issueRepository, LabelRepository labelRepository, PRIssueRepository prIssueRepository, ProjectRepository projectRepository) {
        this.assigneeRepository = assigneeRepository;
        this.attachmentRepository = attachmentRepository;
        this.buildNoteRepository = buildNoteRepository;
        this.issueRepository = issueRepository;
        this.labelRepository = labelRepository;
        this.prIssueRepository = prIssueRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Issue nr1 = new Issue();
        nr1.setTitle("Create Issue Entity");
        nr1.setComment("Create JPA Entity for Issue");
        nr1.setEstimate(3);
        nr1.setPipeline("Closed");

        Label label = new Label();
        // label.setId(1l);
        label.setLabel("enhancement");
        labelRepository.save(label);
        Set<Label> labels = new HashSet<>();
        labels.add(label);
        nr1.setLabels(labels);

        Assignee assignee = new Assignee();
        // assignee.setId(1l);
        assignee.setEmail("maxi@schremser.com");
        assignee.setGithubUser("maxschremser");
        assignee.setPrUser("maxi");
        Set<Assignee> assignees = new HashSet<>();
        assignees.add(assignee);
        assigneeRepository.save(assignee);
        nr1.setAssignees(assignees);

        issueRepository.save(nr1);
    }
}
