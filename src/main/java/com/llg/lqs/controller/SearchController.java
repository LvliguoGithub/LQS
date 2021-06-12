package com.llg.lqs.controller;

import com.llg.lqs.model.Literature;
import com.llg.lqs.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SearchController {

    @Autowired
    private LiteratureService literatureService;

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/search/json")
    public Literature searchJson() {
        return getLiterature();
    }

    @GetMapping("/search/str")
    public String searchStr() {
        return getLiterature().toString();
    }

    @GetMapping("/search")
    public Page<Literature> search(@RequestParam String content, PageRequest pageRequest) {
        return literatureService.findByContent(content, pageRequest);
    }
    private Literature getLiterature() {

        Literature literature = new Literature();
        literature.setContent("This is test content.");
        literature.setName("my literature");
        literature.setType("cg");
        return literature;
    }
}
