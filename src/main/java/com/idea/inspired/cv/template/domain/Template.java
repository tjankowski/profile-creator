package com.idea.inspired.cv.template.domain;

import static com.google.common.collect.Lists.newArrayList;
import static com.idea.inspired.cv.base.util.ApplicationConstants.SCHEMA;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.idea.inspired.cv.attribute.domain.Attribute;
import com.idea.inspired.cv.base.domain.AbstractEntity;

@Entity
@Table(schema = SCHEMA, name = "templates")
public class Template extends AbstractEntity {

	private String name;
	private List<Attribute> attributes = newArrayList();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addAttribute(Attribute attribute) {
		return attributes.add(attribute);
	}
	
	public boolean removeAttibute(Attribute attribute) {
		return attributes.remove(attribute);
	}

}
