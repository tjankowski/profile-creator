package com.idea.inspired.cv.attribute.value.domain;

import static com.idea.inspired.cv.base.util.ApplicationConstants.SCHEMA;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.idea.inspired.cv.attribute.domain.Attribute;
import com.idea.inspired.cv.base.domain.AbstractEntity;

@Entity
@Table(schema = SCHEMA, name = "attribute_values")
public abstract class AttributeValue<E> extends AbstractEntity {
	
	private Attribute attribute;
	
	public abstract String getValueAsString();

	public abstract void setValue(E value);

	public abstract E getValue();

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public Attribute getAttribute() {
		return attribute;
	}

}
