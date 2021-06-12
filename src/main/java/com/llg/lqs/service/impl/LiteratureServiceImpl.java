package com.llg.lqs.service.impl;

import com.llg.lqs.dao.LiteratureRepository;
import com.llg.lqs.model.Literature;
import com.llg.lqs.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("literatureService")
public class LiteratureServiceImpl implements LiteratureService {

    @Autowired
    private LiteratureRepository literatureRepository;

    @Override
    public Page<Literature> findByContent(String content, Pageable pageable) {
        return literatureRepository.findByContent(content, pageable);
    }
}
