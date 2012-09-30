package com.idea.inspired.cv.attribute.value.domain;

import java.util.Date;

public class DateAttributeValue extends AttributeValue<Date> {
	
	private Date value;

	@Override
	public String getValueAsString() {
		return value.toString();
	}
	
	public Date getValue() {
		return value;
	}
	
	public void setValue(Date value) {
		this.value = value;
	}

}
