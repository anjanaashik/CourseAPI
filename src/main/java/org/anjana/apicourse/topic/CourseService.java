package org.anjana.apicourse.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	public CourseRepository getCourserepository() {
		return courseRepository;
	}
	@Qualifier("courseRepository")
	public void setCourserepository(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	//get all resources
	public List<Courses> getAllCourse(String topicID){
		List<Courses> courses = new ArrayList<>();
		courseRepository.findByTopicsId(topicID);
		/*.forEach(courses::add);*/
		return courses;
	}
	
	//get single resource
   public Courses getCourse(String id){
	   return courseRepository.findOne(id);
   }

   public void addCourse(Courses course) {
	   courseRepository.save(course);
   }

public void updateCourse(Courses course, String id) {
	courseRepository.save(course);
}

public void deleteCourse(String id) {
	courseRepository.delete(id);
}
   
   //create new resource
}
