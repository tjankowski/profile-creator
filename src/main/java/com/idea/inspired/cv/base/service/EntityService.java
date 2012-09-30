package com.idea.inspired.cv.base.service;

import java.io.Serializable;

import com.idea.inspired.cv.base.domain.Entity;


public interface EntityService<E extends Entity<ID>, ID extends Serializable> {
	
	public E findById(ID id);

}
