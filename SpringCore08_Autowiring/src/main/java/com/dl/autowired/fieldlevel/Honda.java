package com.dl.autowired.fieldlevel;

import org.springframework.beans.factory.annotation.Autowired;

public class Honda {
	
	@Autowired
	private Models models;

	public Models getModels() {
		return models;
	}
	
	public void setModels(Models models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}
	
	public Honda() {
	}
	
	public Honda(Models models) {
		super();
		this.models = models;
	}
	
}