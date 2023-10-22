package contact;

public class Contact {

	//Variables
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;


//constructor
	public Contact(String ID, String firstName, String lastName, String phoneNum, String address) {
		
		//variable checks
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID format");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name format");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name format");
		}
		if(phoneNum == null || phoneNum.length()>10) {
			throw new IllegalArgumentException("Invalid Phone Number format");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address format");
		}
		
		//assignments	
		this.id = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;

	}
	

// getters and setters
	public String getid() {
		return id;
	}

	public void setid(String ID) {
		this.id = ID;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNum = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}//end class