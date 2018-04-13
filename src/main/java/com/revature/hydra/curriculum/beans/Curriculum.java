package com.revature.hydra.curriculum.beans;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.hydra.util.ReflectionUtils;

@Entity
@Table(name = "Curriculum")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Curriculum {

	@Id
	@Column(name="ID")
	@SequenceGenerator(initialValue=0,
					   allocationSize=1,
					   name="CURRICULUM_ID_SEQ_GEN", 
					   sequenceName="CURRICULUM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
					generator="CURRICULUM_ID_SEQ_GEN")
	private Integer id;
	
	@Column(name="NAME")
	@NotEmpty(message="Curriculum name cannot be empty")
	@NotNull
	private String name;
	
	@Column(name="VERSION")
	@NotNull
	private Integer version;
	
	@Column(name="CREATOR_ID")
	@NotNull
	private Integer creatorId;
	
	@Column(name="MODIFIER_ID")
	@NotNull
	private Integer modifierId;
	
	@Column(name="DATE_CREATED")
	@NotNull
	private Timestamp dateCreated;
	
	@Column(name="WEEK_DURATION")
	@NotNull
	private Integer weekDuration;
	
	//should probably be a boolean
	@Column(name="MASTER_VERSION")
	private Boolean masterVersion;
	
	
	public Curriculum() {
	}


	public Curriculum(Integer id, String name, Integer version, Integer creatorId, Integer modifierId,
			Timestamp dateCreated, Integer duration, Boolean masterVersion) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.creatorId = creatorId;
		this.modifierId = modifierId;
		this.dateCreated = dateCreated;
		this.weekDuration = duration;
		this.masterVersion = masterVersion;
	}
	
	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public Integer getModifierId() {
		return modifierId;
	}

	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Integer getWeekDuration() {
		return weekDuration;
	}

	public void setWeekDuration(Integer weekDuration) {
		this.weekDuration = weekDuration;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getMasterVersion() {
		return masterVersion;
	}

	@Override
	public String toString() {
		return "Curriculum [(Curriculum Id) \t id=" + id + ",\n"
				+ "(Name) \t name=" + name + ",\n"
				+ "(Version) \t version=" + version + ",\n"
				+ "(Created by) \t creatorId=" + creatorId + ",\n"
				+ "(Last Modified by) \t modifierId=" + modifierId + ",\n "
				+ "(Created on) \t dateCreated=" + dateCreated + ",\n"
				+ "(Duration in weeks) \t weekDuration=" + weekDuration + ",\n"
				+ "(Master Version) \t masterVersion=" + masterVersion + "\n]";
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((creatorId == null) ? 0 : creatorId.hashCode());
		result = PRIME * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		result = PRIME * result + ((masterVersion == null) ? 0 : masterVersion.hashCode());
		result = PRIME * result + ((modifierId == null) ? 0 : modifierId.hashCode());
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
		result = PRIME * result + ((version == null) ? 0 : version.hashCode());
		result = PRIME * result + ((weekDuration == null) ? 0 : weekDuration.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ReflectionUtils.testEquality(this, obj);
	}
}
