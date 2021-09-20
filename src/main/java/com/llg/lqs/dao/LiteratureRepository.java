package com.llg.lqs.dao;

import com.llg.lqs.entity.Literature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteratureRepository extends JpaRepository<Literature, Long> {

    @Query("select ltName,ltDigest from Literature lt where lt.ltDigest like %?1% " +
            "or lt.ltName like %?1% " +
            "or lt.unit like %?1% " +
            "or lt.country like %?1% " +
            "or lt.project like %?1% " +
            "or lt.journals like %?1% " +
            "or lt.ltDesc like %?1% " +
            "or lt.authors like %?1%")
    Page<Literature> findByAny(String queryStr, Pageable pageable);
}
