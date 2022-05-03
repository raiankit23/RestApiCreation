package com.springrest.springrest.services;

import entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    Course addCourse(Course course);
}
