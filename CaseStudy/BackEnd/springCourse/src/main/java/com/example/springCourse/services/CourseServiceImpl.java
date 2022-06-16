package com.example.springCourse.services;

import com.example.springCourse.dao.CourseDao;
import com.example.springCourse.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
//    List<Course> list;
    @Autowired
    private CourseDao courseDao;
    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(145, "Java Core Course", "Core"));
//        list.add(new Course(235, "Java spring Course", "Moderate"));
    }
    @Override
    public List<Course> getCourses() {
//        return list;
        return this.courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourse(long id) {
//        Course c = null;
//        for(Course course : list){
//            if(course.getId() == id){
//                c = course;
//                break;
//            }
//        }
//        return Optional.ofNullable(c);
        return this.courseDao.findById(id);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;
        this.courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(String id) {
        long Id = Long.parseLong((id));
//        list = this.list.stream().filter(e->e.getId() != Id).collect(Collectors.toList());
        this.courseDao.deleteById(Id);

    }
}
