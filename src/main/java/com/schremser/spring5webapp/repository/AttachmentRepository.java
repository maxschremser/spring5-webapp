package com.schremser.spring5webapp.repository;

import com.schremser.spring5webapp.model.Attachment;
import org.springframework.data.repository.CrudRepository;

public interface AttachmentRepository extends CrudRepository<Attachment, Long> {
}
