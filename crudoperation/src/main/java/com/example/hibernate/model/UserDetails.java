package com.example.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Version;

@Entity
//@org.hibernate.annotations.Entity(selectBeforeUpdate = true) // Check first is any update then it will run update query or else not
@NamedQuery(name = "UserDetails.byId", query = "from UserDetails where userId > ?1")// Hql Language 
//@NamedNativeQuery(name = "UserDetails.byName", query = "select * from UserDetails where userName = ?1",resultClass = UserDetails.class)// Sql Language
public class UserDetails  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;

	@Version
	@Column(name = "Version")
	private int version;

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
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
