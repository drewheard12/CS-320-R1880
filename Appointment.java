package appointment;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Appointment {

	//variables
	private String id;
	private LocalDate date;
	private String desc;//description
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");//not used
	
	//constructor
	public Appointment(String ID, LocalDate date, String desc) {
		//variable illegal checks
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID format");
		}
		
		LocalDate today = LocalDate.now(ZoneId.systemDefault());
		if(date == null || (date.isBefore(today))) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if(desc == null || desc.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
			
			//assignments	
			this.id = ID;
			this.date = date;
			this.desc = desc;
		
	}
	
	// getters and setters
	public String getid() {
		return id;
	}
		
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate Date) {
		this.date = Date;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String Desc) {
		this.desc=Desc;
	}
	
} // end class
