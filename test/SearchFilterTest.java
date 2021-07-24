package com.llg.literature.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFilterTest {
    @Autowired
    private SearchFilter searchFilter;

    @Test
    public void test() {
        String word1 = "word";
        assert searchFilter.filterSearchContent(word1).length() == 4;

        String word2 = "this is word too large";
        assert searchFilter.filterSearchContent(word2).length() == 10;

        String word3 = "中文";
        assert searchFilter.filterSearchContent(word3).length() == 2;

        String word4 = "中文打字";
        assert searchFilter.filterSearchContent(word4).length() == 3;
    }
}
