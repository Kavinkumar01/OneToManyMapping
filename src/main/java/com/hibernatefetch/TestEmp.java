package hibernatefetch;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TestEmp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	private String empName;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "frn_key_add_id")//This is required if we don't want the default name for column(doorNo)
//	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "frn_key_id")
	private Set<Address> Addresses;

	
	
	public TestEmp() {
	}

	
	public TestEmp(long empId, String empName, Set<Address> addresses) {
		this.empId = empId;
		this.empName = empName;
		Addresses = addresses;
		System.out.println("The emp object is created");
	}



	@Override
	public String toString() {
		return "TestEmp [empId=" + empId + ", empName=" + empName + ", Addresses=" + Addresses + "]";
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<Address> getAddresses() {
		return Addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		Addresses = addresses;
	}
	

}
