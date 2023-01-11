package com.theophilusgordon.server.services;

import com.theophilusgordon.server.entity.CorrectOptionEntity;
import com.theophilusgordon.server.model.CorrectOption;
import com.theophilusgordon.server.repository.CorrectOptionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CorrectOptionServiceImpl implements CorrectOptionService {

    private final CorrectOptionRepository correctOptionRepository;

    public CorrectOptionServiceImpl(CorrectOptionRepository correctOptionRepository) {
        this.correctOptionRepository = correctOptionRepository;
    }
    @Override
    public CorrectOption createCorrectOption(CorrectOption correctOption) {
        CorrectOptionEntity correctOptionEntity = new CorrectOptionEntity();

        BeanUtils.copyProperties(correctOption, correctOptionEntity);
        correctOptionRepository.save(correctOptionEntity);
        return correctOption;
    }
}