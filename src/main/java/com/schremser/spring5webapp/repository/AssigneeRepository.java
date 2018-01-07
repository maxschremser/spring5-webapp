package com.schremser.spring5webapp.repository;

import com.schremser.spring5webapp.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
