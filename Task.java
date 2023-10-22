package task;

public class Task {

	//Variables
	private String id;
	private String name;
	private String desc;

//constructor
	public Task(String ID, String name, String desc) {
		
		//variable checks
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID format");
		}
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Name format");
		}
		if(desc == null || desc.length()>50) {
			throw new IllegalArgumentException("Invalid Description format");
		}
		
		//assignments	
		this.id = ID;
		this.name = name;
		this.desc = desc;

	}

// getters and setters
	public String getid() {
		return id;
	}
//no changing ids, no setter for id
	
	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String Desc) {
		this.desc = Desc;
	}

}//end class