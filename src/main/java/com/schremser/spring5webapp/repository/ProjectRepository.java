package com.schremser.spring5webapp.repository;

import com.schremser.spring5webapp.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
