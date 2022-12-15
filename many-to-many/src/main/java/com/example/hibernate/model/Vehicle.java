package com.example.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	//for onetomany in userDetails
	
//	@ManyToMany(mappedBy = "vehicle")
////	@ManyToOne
////	@NotFound(action = NotFoundAction.IGNORE) //It will not through exception if  user not found
//	@JoinTable(name = "User_Vehicle", joinColumns = @JoinColumn(name = "VEHICLE_ID"), inverseJoinColumns = @JoinColumn(name = "USER_ID"))
//	private Collection<UserDetails> userList = new ArrayList<UserDetails>();
////	private UserDetails user;

	
//	public Collection<UserDetails> getUserList() {
//		return userList;
//	}
//
//	public void setUserList(Collection<UserDetails> userList) {
//		this.userList = userList;
//	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
