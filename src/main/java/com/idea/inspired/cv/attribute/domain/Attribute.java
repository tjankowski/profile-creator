package com.idea.inspired.cv.attribute.domain;

import static com.idea.inspired.cv.base.util.ApplicationConstants.SCHEMA;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.idea.inspired.cv.base.domain.AbstractEntity;

@Entity
@Table(schema = SCHEMA, name = "attributes")
public class Attribute extends AbstractEntity {

	private String code;
	private String name;
	private String description;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
