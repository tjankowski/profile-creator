package com.idea.inspired.cv.attribute.value.domain;

public class StringAttributeValue extends AttributeValue<String> {
	
	private String value;

	@Override
	public String getValueAsString() {
		return value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

}
