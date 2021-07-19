package com.llg.lqs.controller;

import com.llg.lqs.model.Literature;
import com.llg.lqs.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
class SearchController {

    @Autowired
    private LiteratureService literatureService;

    @GetMapping("/search")
    public Page<Literature> search(@RequestParam("query") String queryStr) {
        PageRequest pageRequest = PageRequest.of(0, 10);
        return literatureService.findByAny(queryStr, Pageable.unpaged());
    }

    @GetMapping("/search/all")
    public Page<Literature> findAll() {
        PageRequest pageRequest = PageRequest.of(0, 1);
        return literatureService.findAll(pageRequest);
    }
}
