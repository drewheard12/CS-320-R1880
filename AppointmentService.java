package appointment;

import java.util.ArrayList;


public class AppointmentService {
	private ArrayList<Appointment> appointArr;
	
	//constructor
	public AppointmentService() {
		appointArr = new ArrayList<>();
	}
	
	public boolean add(Appointment Appointment) {
	    boolean checker = false;
	    for (Appointment temp : appointArr) {
	       if (temp.equals(Appointment)) {
	           checker = true;
	       }
	    }
	       if (checker == false) {
	    	   appointArr.add(Appointment);
	           System.out.println("Appointment added.");
	           return true;
	       } else {
	           System.out.println("Appointment already booked.");
	           return false;
	       }
	   }

	public boolean remove(String ID) {
	       for (Appointment temp : appointArr) {
	           if (temp.getid().equals(ID)) {
	        	   appointArr.remove(temp);
	               System.out.println("Appointment removed.");
	               return true;
	           }
	       }
	       System.out.println("Appointment does not exist.");
	       return false;
	   }
	
}//end class
