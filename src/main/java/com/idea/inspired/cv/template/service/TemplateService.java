package com.idea.inspired.cv.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idea.inspired.cv.template.doa.TemplateRepository;

@Service
public class TemplateService {
	
	@Autowired
	private TemplateRepository repository;
	
	public void setRepository(TemplateRepository repository) {
		this.repository = repository;
	}

}
