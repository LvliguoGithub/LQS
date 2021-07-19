package com.llg.lqs.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Document(indexName = "literature")
public class Literature {

    @Id
    private String id;

    private String ltName;

    private String ltType;

    private String ltRange;

    private String ltReadability;

    private Date publicationTime;

    private String country;

    private String unit;

    private String unitCategory;

    private String doi;

    private String authors;

    private String project;

    private String journals;

    private Integer referenceAmount;

    private Integer recommendedAmount;

    private Integer sharedAmount;

    private Integer readedAmount;

    private String imgUr;

    private String ltDescrib;

    private String comments;

    @Override
    public String toString() {
        return "Literature{" +
                "id='" + id + '\'' +
                ", ltName='" + ltName + '\'' +
                ", ltType='" + ltType + '\'' +
                ", ltRange='" + ltRange + '\'' +
                ", ltReadability='" + ltReadability + '\'' +
                ", publicationTime=" + publicationTime +
                ", country='" + country + '\'' +
                ", unit='" + unit + '\'' +
                ", unitCategory='" + unitCategory + '\'' +
                ", doi='" + doi + '\'' +
                ", authors='" + authors + '\'' +
                ", project='" + project + '\'' +
                ", journals='" + journals + '\'' +
                ", referenceAmount=" + referenceAmount +
                ", recommendedAmount=" + recommendedAmount +
                ", sharedAmount=" + sharedAmount +
                ", readedAmount=" + readedAmount +
                ", imgUr='" + imgUr + '\'' +
                ", ltDescrib='" + ltDescrib + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
