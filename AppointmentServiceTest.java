package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import appointment.Appointment;
import appointment.AppointmentService;


public class AppointmentServiceTest {
	
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");//not used
	LocalDate testNow = LocalDate.now();
	LocalDate testTomorrow = testNow.plusDays(1);
	LocalDate testPast = LocalDate.of(1970, 12,12);
	LocalDate testFuture = LocalDate.of(2023, 12,12);

	//add working test
	   @Test
	   public void AddCheck() {
		  AppointmentService tempApp = new AppointmentService();
	      Appointment temp1 = new Appointment("1", testNow, "Doctor");
	      Appointment temp2 = new Appointment("2", testTomorrow, "Dentist");
	      Appointment temp3 = new Appointment("3", testFuture, "Taxes");
	       assertEquals(true, tempApp.add(temp1));
	       assertEquals(true, tempApp.add(temp2));
	       assertEquals(true, tempApp.add(temp3));
	   }

	   //add fail test
	   @Test
	   public void AddFail() {
		  AppointmentService tempApp = new AppointmentService();
	      Appointment temp1 = new Appointment("1", testNow, "Doctor");
	      Appointment temp2 = new Appointment("2", testTomorrow, "Dentist");
	      Appointment temp3 = new Appointment("3", testFuture, "Taxes");
	       assertEquals(true, tempApp.add(temp1));
	       assertEquals(false, tempApp.add(temp1));
	       assertEquals(true, tempApp.add(temp2));
	       assertEquals(true, tempApp.add(temp3));
	   }
	
	   //remove working test
	   @Test
	   public void RemoveCheck() {
		   AppointmentService tempApp = new AppointmentService();
		   Appointment temp1 = new Appointment("1", testNow, "Doctor");
		   Appointment temp2 = new Appointment("2", testTomorrow, "Dentist");
		   Appointment temp3 = new Appointment("3", testFuture, "Taxes");
	       assertEquals(true, tempApp.add(temp1));
	       assertEquals(true, tempApp.add(temp2));
	       assertEquals(true, tempApp.add(temp3));
	       assertEquals(true, tempApp.remove("1"));
	       assertEquals(true, tempApp.remove("2"));
	   }

	//remove fail test
	   @Test
	   public void RemoveFail() {
		   AppointmentService tempApp = new AppointmentService();
		   Appointment temp1 = new Appointment("1", testNow, "Doctor");
		   Appointment temp2 = new Appointment("2", testTomorrow, "Dentist");
		   Appointment temp3 = new Appointment("3", testFuture, "Taxes");
	       assertEquals(true, tempApp.add(temp1));
	       assertEquals(true, tempApp.add(temp2));
	       assertEquals(true, tempApp.add(temp3));
	       assertEquals(false,tempApp.remove("4"));
	       assertEquals(true, tempApp.remove("2"));
	   }
	
} //end class
