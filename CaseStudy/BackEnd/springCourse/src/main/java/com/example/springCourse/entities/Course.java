package com.example.springCourse.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {
    @Id
    private long compCode;
    private String name;
    private String ceo;
    private String website;
    private String stkEx;

    public Course() {
    }

    public Course(long compCode, String name, String ceo, String website, String stkEx) {
        this.compCode = compCode;
        this.name = name;
        this.ceo = ceo;
        this.website = website;
        this.stkEx = stkEx;
    }

    public long getCompCode() {
        return compCode;
    }

    public String getName() {
        return name;
    }

    public String getCeo() {
        return ceo;
    }

    public String getWebsite() {
        return website;
    }

    public String getStkEx() {
        return stkEx;
    }

    @Override
    public String toString() {
        return "Course{" +
                "compCode=" + compCode +
                ", name='" + name + '\'' +
                ", ceo='" + ceo + '\'' +
                ", website='" + website + '\'' +
                ", stkEx='" + stkEx + '\'' +
                '}';
    }
}


//    Company Code
//    b. Company Name
//    c. Company CEO
//    d. Company Turnover
//    e. Company Website
//    f. Stock Exchange it is enlisted in
//        (BSE, NSE etc)