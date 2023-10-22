package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import appointment.Appointment;
import appointment.AppointmentService;


//class creation test
public class AppointmentTest {
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate testNow = LocalDate.now();
	LocalDate testTomorrow = testNow.plusDays(1);
	LocalDate testPast = LocalDate.of(1970, 12,12);
	LocalDate testFuture = LocalDate.of(2023, 12,12);
	
	@Test
	void testAppointmentClass() {
		Appointment testclass = new Appointment ("1", testNow, "Doctor");
		assertTrue(testclass.getid().equals("1"));
		assertTrue(testclass.getDate().equals(testNow));
		assertTrue(testclass.getDesc().equals("Doctor"));

	}
	
	//variable rules tests
	@Test
	void testIdLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("123456789101112", testNow, "Doctor");
		 });      
		}
	
	
	@Test
	void testDesc() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", testNow, "'An apple a day keeps the doctor away' does not mean to throw apples at your doctor.");
		 });      
		}
	
	@Test
	void testDateInPast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", testPast, "Doctor");
		});
	}
	
	//empty (null) tests
		@Test
		void testEmptyId() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment(null, testTomorrow, "Doctor");
			 });      
			}
		
		@Test
		void testEmptyDate() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment("1", null, "Doctor");
			 });      
			}
		
		@Test
		void testEmptyDesc() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment("1", testTomorrow, null);
			 });      
			}

}
