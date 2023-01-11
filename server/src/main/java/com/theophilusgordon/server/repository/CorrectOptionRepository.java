package com.theophilusgordon.server.repository;

import com.theophilusgordon.server.entity.CorrectOptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrectOptionRepository extends JpaRepository<CorrectOptionEntity, Long> {
}