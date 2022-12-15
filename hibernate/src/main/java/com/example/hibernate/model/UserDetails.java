package com.example.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.Type;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.sun.xml.bind.v2.runtime.Name;

@Entity
public class UserDetails {

	@Id
	@Column(name = "UserId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;

	@OneToMany(mappedBy = "user")
//	@JoinTable(name = "USER_VEHICLE",joinColumns = @JoinColumn(name = "USER_ID"),
//	inverseJoinColumns = @JoinColumn(name= "VEHICLE_ID"))
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

//	@Embedded
//	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "Home_Street")),
//			@AttributeOverride(name = "city", column = @Column(name = "Home_city")),
//			@AttributeOverride(name = "state", column = @Column(name = "Home_state")),
//			@AttributeOverride(name = "pincode", column = @Column(name = "Home_pincode")) })
//	private Address homeAddress;
//	private Address officeAddress;

//	@ElementCollection(fetch = FetchType.EAGER)
//	@JoinTable(name = "User_Address", joinColumns = @JoinColumn(name = "User_Id"))
//	@GenericGenerator(name = "increment-gen", strategy = "increment")
//	@CollectionId(column = @Column(name = "ADDRESS_ID"), generator = "increment-gen", type = @Type(type = "long"))
//	private Collection<Address> listOfAddress = new ArrayList<Address>();

//	private String phone;
//	@Temporal(TemporalType.DATE)
//	private Date date;

//	public Set<Address> getListAddress() {
//		return listOfAddress;
//	}

//	public void setListAddress(Set<Address> listAddress) {
//		this.listOfAddress = listAddress;
//	}

//	public Collection<Address> getListOfAddress() {
//		return listOfAddress;
//	}
//
//	public void setListOfAddress(Collection<Address> listOfAddress) {
//		this.listOfAddress = listOfAddress;
//	}

//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}

	// -----------
//	public Vehicle getVehicle() {
//	return vehicle;
//}
//OnetoOne
//public void setVehicle(Vehicle vehicle) {
//	this.vehicle = vehicle;
//}
}
