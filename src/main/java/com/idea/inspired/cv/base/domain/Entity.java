package com.idea.inspired.cv.base.domain;

import java.io.Serializable;

public interface Entity<ID extends Serializable> {
	
	public void setId(ID id);
	public ID getId();

}
