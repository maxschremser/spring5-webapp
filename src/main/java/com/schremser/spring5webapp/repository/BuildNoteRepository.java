package com.schremser.spring5webapp.repository;

import com.schremser.spring5webapp.model.BuildNote;
import org.springframework.data.repository.CrudRepository;

public interface BuildNoteRepository extends CrudRepository<BuildNote, Long> {
}
