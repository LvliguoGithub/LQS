package com.llg.lqs.dao;

import com.llg.lqs.model.Literature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LiteratureRepository extends ElasticsearchRepository<Literature, String> {

    Page<Literature> findByContent(String content, Pageable pageable);
}
