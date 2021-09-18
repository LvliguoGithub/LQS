package com.llg.lqs.service;

import com.llg.lqs.entity.Literature;
import com.llg.lqs.vo.LiteratureVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.InputStream;

public interface LiteratureService {

    Page<LiteratureVo> findByAny(String content, Pageable pageable);

    Page<Literature> findAll(Pageable pageable);

    Literature findById(String id);

    String importExcel(InputStream inputStream, String path) throws Exception;
}
