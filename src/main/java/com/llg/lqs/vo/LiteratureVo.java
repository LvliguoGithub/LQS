package com.llg.lqs.vo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

@Data
@Document(indexName = "literature")
public class LiteratureVo {

    @Id
    private String id;

    @Field("lt_name")
    private String ltName;

    @Field("lt_range")
    private String ltRange;

    @Field("lt_readability")
    private String ltReadability;

    @Field(name = "publication_time")
    private Date publicationTime;

    @Field("doi")
    private String doi;

    @Field("authors")
    private String authors;

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

    @Field("lt_digest")
    private String ltDigest;

    @Field("lt_content")
    private String ltContent;
}
