package com.revature.beans.remote;

import com.revature.util.ReflectionUtils;

/**
 * Bean representing a subtopic persisted in the topic service.
 * 
 * <br>
 * <br>
 * <b>Last Modified:</b>
 *  <pre style="margin:0;border:0;padding:0;">    15 April 2018</pre>
 *  
 * @see Topic
 * 
 * @author [see same bean in hydra-topic-service (1802-Matt)]  
 * @author Ricky Baker (1802-Matt)
 * @author Seth Maize (1802-Matt)
 * 
 * @version 2.0
 */
public class Subtopic {
    private Integer subtopicId;
    private String subtopicName;
    private String status;
    private Topic parentTopic;
    
    public Subtopic() {
        super();
    }

    public Subtopic(String subtopicName, String status, Topic parentTopic) {
        super();
        this.subtopicName = subtopicName;
        this.status = status;
        this.parentTopic = parentTopic;
    }

    public int getSubtopicId() {
        return subtopicId;
    }

    public void setSubtopicId(int subtopicId) {
        this.subtopicId = subtopicId;
    }

    public String getSubtopicName() {
        return subtopicName;
    }

    public void setSubtopicName(String subtopicName) {
        this.subtopicName = subtopicName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Topic getParentTopic() {
        return parentTopic;
    }

    public void setParentTopic(Topic parentTopic) {
        this.parentTopic = parentTopic;
    }
    
    @Override
    public String toString() {
        return "Subtopic [\n" 
                + "(Subtopic ID) \t subtopicId=" + subtopicId + ",\n"
                + "(Subtopic's Status) \t status=" + status+ ",\n"
                + "(Subtopic's Name) \t subtopicName=" + subtopicName+ ",\n"
                + "(Parent topic) \t parentTopic=" + parentTopic.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((parentTopic == null) ? 0 : parentTopic.hashCode());
        result = PRIME * result + ((status == null) ? 0 : status.hashCode());
        result = PRIME * result + subtopicId;
        result = PRIME * result + ((subtopicName == null) ? 0 : subtopicName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return ReflectionUtils.testEquality(this, obj);
    }

    
}