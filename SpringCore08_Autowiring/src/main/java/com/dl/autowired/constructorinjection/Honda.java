package com.dl.autowired.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Honda {

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
	
	@Autowired
	public Honda(Models models) {
		super();
		this.models = models;
	}
	
}