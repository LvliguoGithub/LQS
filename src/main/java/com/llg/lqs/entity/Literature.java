package com.llg.lqs.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

@Data
@Document(indexName = "literature")
public class Literature {

    @Id
    private String id;

    @Field("lt_name")
    private String ltName;

    @Field("lt_type")
    private String ltType;

    @Field("lt_range")
    private String ltRange;

    @Field("lt_readability")
    private String ltReadability;

    @Field(name = "publication_time")
    private Date publicationTime;

    @Field("country")
    private String country;

    @Field("unit")
    private String unit;

    @Field("unit_category")
    private String unitCategory;

    @Field("doi")
    private String doi;

    @Field("authors")
    private String authors;

    @Field("project")
    private String project;

    @Field("journals")
    private String journals;

    @Field("reference_amount")
    private Integer referenceAmount;

    @Field("recommend_amount")
    private Integer recommendedAmount;

    @Field("shared_amount")
    private Integer sharedAmount;

    @Field("readed_amount")
    private Integer readedAmount;

    @Field("img_url")
    private String imgUrl;

    @Field("lt_desc")
    private String ltDesc;

    @Field("comments")
    private String comments;

    @Field("lt_digest")
    private String ltDigest;

    @Field("lt_content")
    private String ltContent;

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
                ", imgUrl='" + imgUrl + '\'' +
                ", ltDesc='" + ltDesc + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
