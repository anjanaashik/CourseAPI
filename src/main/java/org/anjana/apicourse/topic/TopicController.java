package org.anjana.apicourse.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	
	
	
	public TopicService getTopicservice() {
		return topicservice;
	}

	public void setTopicservice(TopicService topicservice) {
		this.topicservice = topicservice;
	}

//get all resources
@RequestMapping("/Topics")	
	public List<Topics> getAllTopics(){
	 return topicservice.getAllTopics();
	}

   //get single resource
@RequestMapping("/Topics/{id}")
public Topics getTopic(@PathVariable String id){
	return topicservice.getTopic(id);
	}

  //create new resource
@RequestMapping(method=RequestMethod.POST,value="/Topics")
public void addTopic(@RequestBody Topics topic){
	 topicservice.addTopic(topic);
}

@RequestMapping(method=RequestMethod.PUT,value="/Topics/{id}")
public void updateTopic(@RequestBody Topics topic,@PathVariable String id){
	 topicservice.updateTopic(topic,id);
}

@RequestMapping(method=RequestMethod.DELETE,value="/Topics/{id}")
public void deleteTopic(@PathVariable String id){
	 topicservice.deleteTopic(id);
}


}
