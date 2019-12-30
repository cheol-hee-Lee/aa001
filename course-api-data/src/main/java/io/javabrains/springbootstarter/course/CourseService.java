package io.javabrains.springbootstarter.course;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findAll().forEach(courses::add); // rambda(method reference, 각 원소마다 적용할 메서드 지정)
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null); // Optional, orElese(값이 없을 때 null 반환)
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}	
