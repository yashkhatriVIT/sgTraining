package com.example.springCourse.services;

import com.example.springCourse.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    //        GET /api/v1.0/market/company/getall ==> Fetches all the Company Details
    public List<Course> getCourses();

    //        GET /api/v1.0/market/company/info/companycode ==> Fetches the Company Details
    Optional<Course> getCourse(long id);

    //        POST /api/v1.0/market/company/register ==> Register a new company
    Course addCourse(Course course);

    //        DELETE /api/v1.0/market/company/delete/companycode ==> Deletes a company
    void deleteCourse(String id);
}






//        POST /api/v1.0/market/stock/add/companycode ==> Add new stock price
//        GET /api/v/1.0/market/stock/get/companycode/startdate/enddate
