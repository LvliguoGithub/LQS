package com.llg.lqs.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="literature")
public class Literature {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "lt_name")
    private String ltName;

    @Column(name = "lt_type")
    private String ltType;

    @Column(name = "lt_range")
    private String ltRange;

    @Column(name = "lt_readability")
    private String ltReadability;

    @Column(name = "publication_time")
    private Date publicationTime;

    @Column(name = "country")
    private String country;

    @Column(name = "unit")
    private String unit;

    @Column(name = "unit_category")
    private String unitCategory;

    @Column(name = "doi")
    private String doi;

    @Column(name = "authors")
    private String authors;

    @Column(name = "project")
    private String project;

    @Column(name = "journals")
    private String journals;

    @Column(name = "reference_amount")
    private Integer referenceAmount;

    @Column(name = "recommended_amount")
    private Integer recommendedAmount;

    @Column(name = "shared_amount")
    private Integer sharedAmount;

    @Column(name = "readed_amount")
    private Integer readedAmount;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "lt_desc")
    private String ltDesc;

    @Column(name = "comments")
    private String comments;

    @Column(name = "lt_digest")
    private String ltDigest;

    @Column(name = "lt_content")
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
