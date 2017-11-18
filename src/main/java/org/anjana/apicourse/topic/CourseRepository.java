package org.anjana.apicourse.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

interface CourseRepository extends CrudRepository<Courses, String> {
//	
	public List<Courses> findById(String id);
//	public List<Courses> findByDescription(String desc);
//	
	
	public List<Courses> findByTopicsId(String topicID);

}
