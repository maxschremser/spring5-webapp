package com.schremser.spring5webapp.model;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by bluemax on 07.01.18.
 */
@Entity
public class Issue {
    private Long id;
    private String title;
    private String comment;
    private String pipeline;
    private List<String> assignees;
    private List<String> labels;
    private List<String> projects;

}
