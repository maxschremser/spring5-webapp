package com.schremser.spring5webapp.repository;

import com.schremser.spring5webapp.model.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Long> {
}
