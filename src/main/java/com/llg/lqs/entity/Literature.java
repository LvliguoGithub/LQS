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

    public Literature() {
    }

    public Literature(Builder builder) {
        this.doi = builder.doi;
        this.authors = builder.authors;
        this.country = builder.country;
        this.ltDesc = builder.ltDesc;
        this.comments = builder.comments;
        this.imgUrl = builder.imgUrl;
        this.ltDigest = builder.ltDigest;
        this.ltContent = builder.ltContent;
        this.ltName = builder.ltName;
        this.ltRange = builder.ltRange;
        this.ltType = builder.ltType;
        this.ltReadability = builder.ltReadability;
        this.referenceAmount = builder.referenceAmount;
        this.journals = builder.journals;
        this.project = builder.project;
        this.publicationTime = builder.publicationTime;
        this.readedAmount = builder.readedAmount;
        this.recommendedAmount = builder.recommendedAmount;
        this.sharedAmount = builder.sharedAmount;
        this.unit = builder.unit;
        this.unitCategory = builder.unitCategory;
    }

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

    public static class Builder {

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

        private String imgUrl;

        private String ltDesc;

        private String comments;

        private String ltDigest;

        private String ltContent;

        public void ltName(String ltName) {
            this.ltName = ltName;
        }

        public void ltType(String ltType) {
            this.ltType = ltType;
        }

        public void ltRange(String ltRange) {
            this.ltRange = ltRange;
        }

        public void ltReadability(String ltReadability) {
            this.ltReadability = ltReadability;
        }

        public void publicationTime(Date publicationTime) {
            this.publicationTime = publicationTime;
        }

        public void country(String country) {
            this.country = country;
        }

        public void unit(String unit) {
            this.unit = unit;
        }

        public void unitCategory(String unitCategory) {
            this.unitCategory = unitCategory;
        }

        public void doi(String doi) {
            this.doi = doi;
        }

        public void authors(String authors) {
            this.authors = authors;
        }

        public void project(String project) {
            this.project = project;
        }

        public void journals(String journals) {
            this.journals = journals;
        }

        public void referenceAmount(Integer referenceAmount) {
            this.referenceAmount = referenceAmount;
        }

        public void recommendedAmount(Integer recommendedAmount) {
            this.recommendedAmount = recommendedAmount;
        }

        public void sharedAmount(Integer sharedAmount) {
            this.sharedAmount = sharedAmount;
        }

        public void readedAmount(Integer readedAmount) {
            this.readedAmount = readedAmount;
        }

        public void imgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void ltDesc(String ltDesc) {
            this.ltDesc = ltDesc;
        }

        public void comments(String comments) {
            this.comments = comments;
        }

        public void ltDigest(String ltDigest) {
            this.ltDigest = ltDigest;
        }

        public void ltContent(String ltContent) {
            this.ltContent = ltContent;
        }

        public Literature builder() {
            return new Literature(this);
        }
    }
}
