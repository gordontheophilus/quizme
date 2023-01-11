package com.theophilusgordon.server.repository;

import com.theophilusgordon.server.entity.QuestionOptionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionOptionsRepository extends JpaRepository<QuestionOptionsEntity, Long> {
}