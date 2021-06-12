package com.llg.lqs.service;

import com.llg.lqs.model.Literature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LiteratureService {

    Page<Literature> findByContent(String content, Pageable pageable);
}
