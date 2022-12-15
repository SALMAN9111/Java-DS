package com.example.hibernate.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "CAR")
public class FourWheeler extends Vehicle{
	private String sreeingWheel;

	public String getSreeingHandle() {
		return sreeingWheel;
	}

	public void setSreeingHandle(String sreeingHandle) {
		this.sreeingWheel = sreeingHandle;
	} 
	
}
