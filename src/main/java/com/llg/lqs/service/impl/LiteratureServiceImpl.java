package com.llg.lqs.service.impl;

import com.llg.lqs.dao.LiteratureRepository;
import com.llg.lqs.entity.Literature;
import com.llg.lqs.service.LiteratureService;
import com.llg.lqs.vo.LiteratureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("literatureService")
public class LiteratureServiceImpl implements LiteratureService {

    @Autowired
    private LiteratureRepository literatureRepository;

    @Override
    public Page<LiteratureVo> findByAny(String queryStr, Pageable pageable) {
        return literatureRepository.findByAny(queryStr, pageable);
    }

    @Override
    public Page<Literature> findAll(Pageable pageable) {
        return literatureRepository.findAll(pageable);
    }

    @Override
    public Literature findById(String id) {
        return literatureRepository.findById(id).get();
    }
}
