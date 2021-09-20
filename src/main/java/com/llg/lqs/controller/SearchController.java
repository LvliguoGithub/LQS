package com.llg.lqs.controller;

import com.alibaba.druid.util.StringUtils;
import com.llg.lqs.component.SearchFilter;
import com.llg.lqs.entity.Literature;
import com.llg.lqs.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@RestController
@RequestMapping("/backend")
class SearchController {

    @Autowired
    private SearchFilter searchFilter;

    @Autowired
    private LiteratureService literatureService;

    @GetMapping("/search")
    public Page<Literature> search(@RequestParam("query") String queryStr) {
        if (StringUtils.isEmpty(queryStr)) {
            return Page.empty();
        }
        String content = searchFilter.filterSearchContent(queryStr);
        Page<Literature> page = literatureService.findByAny(content, Pageable.unpaged());
        return page;
    }

    @GetMapping("/search/{id}")
    public Literature findById(@PathVariable("id") Long id) {
        return literatureService.findById(id);
    }

    @GetMapping("/search/hot-lt")
    public Page<Literature> findAll() {
        PageRequest pageRequest = PageRequest.of(0, 5);
        return literatureService.findAll(pageRequest);
    }

    @PostMapping("/import/excel")
    public String importExcel(String path) throws Exception {
//        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//        MultipartFile file = multipartRequest.getFile("filename");
//        File file = new File(path);
        File file = new File("F:\\workspace\\文库搜索\\excel\\7BA1DF10.xlsx");
        InputStream inputStream = new FileInputStream(file);
        return literatureService.importExcel(inputStream, "论文数据.xlsx");
    }
}
