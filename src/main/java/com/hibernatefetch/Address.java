package hibernatefetch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doorNo;
	private String state;
	private String country;
//The below is done when we need bidirectional mapping	
//	@OneToOne(mappedBy = "address")
//	@ManyToOne
//	@JoinColumn(name = "empId")
//	public TestEmp emp;
	public Address() {
	}

	public Address(int doorNo, String state, String country, TestEmp emp) {
		this.doorNo = doorNo;
		this.state = state;
		this.country = country;
		System.out.println("The address object is created");
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", state=" + state + ", country=" + country + "]";
	}
	
}
