package com.onlinetutorialspoint.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("01","paul","Racer"),
			new Topic("05","david","football"),
			new Topic("21","chris","thor"),
			new Topic("07","stark","science")
			));
	
	public List<Topic> gettopics(){
		return topics;
		
		
	}

	public Topic getTopicId(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}

	public Topic updateTopicId(String id) {
		
		return null;
	}

	public void addTopicId(Topic topic) {
		
		 topics.add(topic);
	}

}
