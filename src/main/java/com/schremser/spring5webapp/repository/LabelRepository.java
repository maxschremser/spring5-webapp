package com.schremser.spring5webapp.repository;

import com.schremser.spring5webapp.model.Label;
import org.springframework.data.repository.CrudRepository;

public interface LabelRepository extends CrudRepository<Label, Long> {
}
