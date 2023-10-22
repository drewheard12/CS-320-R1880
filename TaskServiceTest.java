package test;

//imports using junit5 library
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import task.Task;
import task.TaskService;

public class TaskServiceTest {

	//add working test
   @Test
   public void AddCheck() {
      TaskService tempContact = new TaskService();
      Task temp1 = new Task("1", "Dance", "Dance like a chicken");
      Task temp2 = new Task("2", "Throw", "Throw something");
      Task temp3 = new Task("3", "Fight", "Fight someone");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(true, tempContact.add(temp3));
   }

   //add fail test
   @Test
   public void AddFail() {
      TaskService tempContact = new TaskService();
      Task temp1 = new Task("1", "Dance", "Dance like a chicken");
	  Task temp2 = new Task("2", "Throw", "Throw something");
	  Task temp3 = new Task("3", "Fight", "Fight someone");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(false, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
   }

   //delete working test
   @Test
   public void DeleteCheck() {
      TaskService tempContact = new TaskService();
      Task temp1 = new Task("1", "Dance", "Dance like a chicken");
	  Task temp2 = new Task("2", "Throw", "Throw something");
	  Task temp3 = new Task("3", "Fight", "Fight someone");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.remove("1"));
       assertEquals(true, tempContact.remove("2"));
   }

//delete fail test
   @Test
   public void DeleteFail() {
      TaskService tempContact = new TaskService();
      Task temp1 = new Task("1", "Dance", "Dance like a chicken");
	  Task temp2 = new Task("2", "Throw", "Throw something");
	  Task temp3 = new Task("3", "Fight", "Fight someone");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(false, tempContact.remove("4"));
       assertEquals(true, tempContact.remove("2"));
   }

//update working test
   @Test
   public void UpdateCheck() {
      TaskService tempContact = new TaskService();
      Task temp1 = new Task("1", "Dance", "Dance like a chicken");
	  Task temp2 = new Task("2", "Throw", "Throw something");
	  Task temp3 = new Task("3", "Fight", "Fight someone");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(true, tempContact.update("3", "Love", "Love someone"));
       assertEquals(true, tempContact.update("2", "Lift", "Lift something"));
   }

// update fail test
   @Test
   public void UpdateFail() {
      TaskService tempContact = new TaskService();
      Task temp1 = new Task("1", "Dance", "Dance like a chicken");
	  Task temp2 = new Task("2", "Throw", "Throw something");
	  Task temp3 = new Task("3", "Fight", "Fight someone");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(false, tempContact.update("4", "Bad", "Task"));
       assertEquals(true, tempContact.update("2", "Throw", "Throw something"));
   }
}
