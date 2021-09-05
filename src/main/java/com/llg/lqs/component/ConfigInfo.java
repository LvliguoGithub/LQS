package com.llg.lqs.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "literature.conf")
public class ConfigInfo {

    private int maxSearchableCharLen;

    private int maxSearchableZhCharLen;

    public int getMaxSearchableCharLen() {
        return maxSearchableCharLen;
    }

    public void setMaxSearchableCharLen(int maxSearchableCharLen) {
        this.maxSearchableCharLen = maxSearchableCharLen;
        this.maxSearchableZhCharLen = this.maxSearchableCharLen / 3;
    }

    public int getMaxSearchableZhCharLen() {
        return maxSearchableZhCharLen;
    }
}
