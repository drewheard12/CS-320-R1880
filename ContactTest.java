package test;

//imports using junit5 library
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contact.Contact;

//class creation test
class ContactTest {
	@Test
	void testContactClass() {
		Contact testclass = new Contact ("717", "Drew", "Heard","999-9999", "1 Co Rd 72");
		assertTrue(testclass.getid().equals("717"));
		assertTrue(testclass.getFirstName().equals("Drew"));
		assertTrue(testclass.getLastName().equals("Heard"));
		assertTrue(testclass.getPhoneNum().equals("999-9999"));
		assertTrue(testclass.getAddress().equals("1 Co Rd 72"));
	}
	
	//variable rules tests
	@Test
	void testIdLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111111111110", "Drew", "Heard","999-9999", "1 Co Rd 72");
		 });      
		}
	
	@Test
	void testFirstLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", "Drewwwwwwwww", "Heard","999-9999", "1 Co Rd 72");
		 });      
		}
	
	@Test
	void testLastLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", "Drew", "Hearddddddddd","999-9999", "1 Co Rd 72");
		 });      
		}
	
	@Test
	void testPhoneLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", "Drew", "Heard nnn nnn","999-999999999999", "1 Co Rd 72");
		 });     
		}
	
	@Test
	void testAddressLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", "Drew", "Heard","999-9999", "1 Co Rd 7272727272727272727272727272727272727272727272727272772");
		 });      
		}
	

	
	
//empty (null) tests
	@Test
	void testEmptyId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Drew", "Heard","999-9999", "1 Co Rd 72");
		 });      
		}
	
	@Test
	void testEmptyFirst() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", null, "Heard","999-9999", "1 Co Rd 72");
		 });      
		}
	
	@Test
	void testEmptyLast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", "Drew", null,"999-9999", "1 Co Rd 72");
		 });      
		}
	
	@Test
	void testEmptyPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", "Drew", "Heard",null, "1 Co Rd 72");
		 });      
		}
	
	@Test
	void testEmptyAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("717", "Drew", "Heard","999-9999", null);
		 	});      
		}
}



