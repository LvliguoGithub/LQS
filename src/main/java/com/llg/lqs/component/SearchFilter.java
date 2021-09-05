package com.llg.lqs.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public final class SearchFilter {

    @Autowired
    private ConfigInfo configInfo;

    public String filterSearchContent(String content) {
        // filter max length
        if (content == null || content.length() < configInfo.getMaxSearchableZhCharLen()) {
            return content;
        }

        char[] chars = content.toCharArray();
        int len = 0;
        for (int i = 0; i < configInfo.getMaxSearchableCharLen() && len < content.length(); i++) {
            if (isChinese(chars[len])) {
                i += 2;
                if (i >= configInfo.getMaxSearchableCharLen()) {
                    break;
                }
            }
            len ++;
        }
        if (len < content.length() - 1) {
            System.out.println("over size.");
            log.warn("Search content length over max searchable character length.");
        }

        return content.substring(0, len);
    }

    private static boolean isChinese(char c) {
        return c >= 0x4E00 &&  c <= 0x9FA5;
    }
}
