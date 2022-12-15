package com.example.hibernate.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "BIKE")
public class TwoWheeler extends Vehicle{
	private String sreeingHandle;

	public String getSreeingHandle() {
		return sreeingHandle;
	}

	public void setSreeingHandle(String sreeingHandle) {
		this.sreeingHandle = sreeingHandle;
	} 
}
