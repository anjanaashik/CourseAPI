package org.anjana.apicourse.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseservice;
	
	

public CourseService getCourseservice() {
		return courseservice;
	}
    @Qualifier("courseservice")
	public void setCourseservice(CourseService courseservice) {
		this.courseservice = courseservice;
	}

//get all resources
@RequestMapping("/Topics/{Topicid}/Courses")	
	public List<Courses> getAllCourses(@PathVariable String Topicid){
	 return courseservice.getAllCourse(Topicid);
	}

   //get single resource
@RequestMapping("/Topics/{Topicid}/Courses/{id}")
public Courses getCourse(@PathVariable String id){
	return courseservice.getCourse(id);
	}

  //create new resource
@RequestMapping(method=RequestMethod.POST,value="/Topics/{Topicid}/Courses")
public void addCourse(@PathVariable String Topicid,@RequestBody Courses course){
	course.setTopic(new Topics(Topicid,"",""));
	courseservice.addCourse(course);
}

@RequestMapping(method=RequestMethod.PUT,value="/Topics/{Topicid}/Courses/{id}")
public void updateCourse(@RequestBody Courses course,@PathVariable String id,@PathVariable String Topicid){
	course.setTopic(new Topics(Topicid,"",""));
	courseservice.updateCourse(course,id);
}

@RequestMapping(method=RequestMethod.DELETE,value="/Topics/{Topicid}/Courses/{id}")
public void deleteCourse(@PathVariable String id){
	courseservice.deleteCourse(id);
}


}
