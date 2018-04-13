package com.revature.hydra.curriculum.beans.remote;

import com.revature.hydra.util.ReflectionUtils;

/**
 * 
 */
public class Topic {

	private int topicID;
	private String topicName;
	
	
	public Topic() {
		super();
	}

	public Topic(String topicName) {
		super();
		this.topicName = topicName;
	}

	public Integer getTopicID() {
		return topicID;
	}//NOSONAR


	public void setTopicID(Integer topicID) {
		this.topicID = topicID;
	}//NOSONAR


	public String getTopicName() {
		return topicName;
	}//NOSONAR


	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}//NOSONAR


	@Override
	public String toString() {
		return "TopicName [\n" +"(Topic ID) \t topicID = " + topicID + ",\n "
				+ "(Topic name) \t topicName = " + topicName + "]";
	}//NOSONAR

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + topicID;
		result = PRIME * result + ((topicName == null) ? 0 : topicName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ReflectionUtils.testEquality(this, obj);
	}
	
	
}