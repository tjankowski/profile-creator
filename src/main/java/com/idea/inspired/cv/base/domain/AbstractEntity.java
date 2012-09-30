package com.idea.inspired.cv.base.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class AbstractEntity implements Entity<Long> {
	
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

}
