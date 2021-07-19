package com.llg.lqs.dao;

import com.llg.lqs.model.Literature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteratureRepository extends ElasticsearchRepository<Literature, String> {

    @Query("{\"multi_match\": {\"query\": \"?0\", \"fields\": [" +
            "\"lt_name\", \"lt_type\", \"authors\", \"comments\", \"country\", \"lt_describ\", \"journals\", \"unit\", \"lt_range\"]}}")
    Page<Literature> findByAny(String queryStr, Pageable pageable);
}
