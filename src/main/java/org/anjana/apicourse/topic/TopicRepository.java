package org.anjana.apicourse.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

interface TopicRepository extends CrudRepository<Topics, String> {
	

}
