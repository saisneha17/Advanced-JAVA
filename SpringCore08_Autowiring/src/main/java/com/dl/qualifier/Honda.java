package com.dl.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Honda {

	@Autowired
	@Qualifier("models_abc")
	private Models model;
	
	public Honda() {
	}

	public Honda(Models model) {
		this.model = model;
	}

	public Models getModel() {
		return model;
	}

	public void setModel(Models model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Honda [model=" + model + "]";
	}

	
}