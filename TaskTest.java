package test;

//imports using junit5 library
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task.Task;

//class creation test
class TaskTest {
	@Test
	void testContactClass() {
		Task testclass = new Task ("1", "Today?", "Take over the world");
		assertTrue(testclass.getid().equals("1"));
		assertTrue(testclass.getName().equals("Today?"));
		assertTrue(testclass.getDesc().equals("Take over the world"));

	}
	
	//variable rules tests
	@Test
	void testIdLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890!", "Today?", "Take over the world");
		 });      
		}
	
	@Test
	void testNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Today?789012345678901!", "Take over the world");
		 });      
		}
	
	@Test
	void testDescLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Today?", "What are we gonna do today, Brain? The same thing we do everyday...Take over the world");
		 });      
		}
	
//empty (null) tests
	@Test
	void testEmptyId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Today?", "Take over the world");
		 });      
		}
	
	@Test
	void testEmptyName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", null, "Take over the world");
		 });      
		}
	
	@Test
	void testEmptyDesc() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1", "Today?", null);
		 });      
		}
}//end



