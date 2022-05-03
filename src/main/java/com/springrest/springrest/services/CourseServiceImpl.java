package com.springrest.springrest.services;

import entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list = new ArrayList<Course>();
        list.add(new Course(101l, "Java", "Learn Java"));
        list.add(new Course(102l, "Python", "Learn Python"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course:list){
            if(course.getId() == courseId){
                c=course;
                break;
            }
        }
        return c;
    }
}
