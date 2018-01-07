package com.schremser.spring5webapp.repository;

import com.schremser.spring5webapp.model.PRIssue;
import org.springframework.data.repository.CrudRepository;

public interface PRIssueRepository extends CrudRepository<PRIssue, Long> {
}
