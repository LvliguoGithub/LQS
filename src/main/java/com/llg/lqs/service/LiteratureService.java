package com.llg.lqs.service;

import com.llg.lqs.model.Literature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LiteratureService {

    Page<Literature> findByAny(String content, Pageable pageable);

    Page<Literature> findAll(Pageable pageable);
}
