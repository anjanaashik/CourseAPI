package org.anjana.apicourse.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Courses{
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topics topics;
	
	Courses(){
		
	}
	Courses(String id,String name,String description,String topicid){
		super();
	this.id =id;
	this.name =name;
	this.description =description;
	this.topics = new Topics(topicid,"","");
	}
	
	
	
	public Topics getTopic() {
		return topics;
	}
	public void setTopic(Topics topic) {
		topics = topic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
