package com.schremser.spring5webapp.controller;

import com.schremser.spring5webapp.repository.IssueRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IssueController {
    private IssueRepository issueRepository;

    public IssueController(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @RequestMapping("/issues")
    public String getIssues(Model model) {
        model.addAttribute("issues", issueRepository.findAll());
        return "issues";
    }
}
