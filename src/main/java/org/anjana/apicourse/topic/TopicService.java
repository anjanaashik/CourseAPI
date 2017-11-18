package org.anjana.apicourse.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicrepository;
	
	
	public TopicRepository getTopicrepository() {
		return topicrepository;
	}
	
	
	public void setTopicrepository(TopicRepository topicrepository) {
		this.topicrepository = topicrepository;
	}

	//get all resources
	public List<Topics> getAllTopics(){
		List<Topics> topics = new ArrayList<>();
		topicrepository.findAll();
		/*.forEach(topics::add);*/
		return topics;
	}
	
	//get single resource
   public Topics getTopic(String id){
	   return topicrepository.findOne(id);
   }

   public void addTopic(Topics topic) {
	   topicrepository.save(topic);
   }

public void updateTopic(Topics topic, String id) {
	topicrepository.save(topic);
}

public void deleteTopic(String id) {
	topicrepository.delete(id);
}
   
   //create new resource
}
