package test;

//imports using junit5 library
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import contact.Contact;
import contact.ContactService;

public class ContactServiceTest {

	//add working test
   @Test
   public void AddCheck() {
      ContactService tempContact = new ContactService();
      Contact temp1 = new Contact("1", "John", "Doe", "111-1111","1 Co Rd 2");
      Contact temp2 = new Contact("2", "Jane", "Deer", "222-2222", "3 AL HW 4");
      Contact temp3 = new Contact("3", "Chester", "Tester", "333-3333", "5 Main St");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(true, tempContact.add(temp3));
   }

   //add fail test
   @Test
   public void AddFail() {
      ContactService tempContact = new ContactService();
      Contact temp1 = new Contact("1", "John", "Doe", "111-1111","1 Co Rd 2");
	  Contact temp2 = new Contact("2", "Jane", "Deer", "222-2222", "3 AL HW 4");
	  Contact temp3 = new Contact("3", "Chester", "Tester", "333-3333", "5 Main St");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(false, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
   }

   //delete working test
   @Test
   public void DeleteCheck() {
      ContactService tempContact = new ContactService();
      Contact temp1 = new Contact("1", "John", "Doe", "111-1111","1 Co Rd 2");
	  Contact temp2 = new Contact("2", "Jane", "Deer", "222-2222", "3 AL HW 4");
	  Contact temp3 = new Contact("3", "Chester", "Tester", "333-3333", "5 Main St");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.remove("1"));
       assertEquals(true, tempContact.remove("2"));
   }

//delete fail test
   @Test
   public void DeleteFail() {
      ContactService tempContact = new ContactService();
      Contact temp1 = new Contact("1", "John", "Doe", "111-1111","1 Co Rd 2");
	  Contact temp2 = new Contact("2", "Jane", "Deer", "222-2222", "3 AL HW 4");
	  Contact temp3 = new Contact("3", "Chester", "Tester", "333-3333", "5 Main St");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(false, tempContact.remove("4"));
       assertEquals(true, tempContact.remove("2"));
   }

//update working test
   @Test
   public void UpdateCheck() {
      ContactService tempContact = new ContactService();
      Contact temp1 = new Contact("1", "John", "Doe", "111-1111","1 Co Rd 2");
	  Contact temp2 = new Contact("2", "Jane", "Deer", "222-2222", "3 AL HW 4");
	  Contact temp3 = new Contact("3", "Chester", "Tester", "333-3333", "5 Main St");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(true, tempContact.update("3", "Chest", "Test", "123-3333", "It worked"));
       assertEquals(true, tempContact.update("2", "Jan", "Dee", "123-2222", "It worked"));
   }

// update fail test
   @Test
   public void UpdateFail() {
      ContactService tempContact = new ContactService();
      Contact temp1 = new Contact("1", "John", "Doe", "111-1111","1 Co Rd 2");
	  Contact temp2 = new Contact("2", "Jane", "Deer", "222-2222", "3 AL HW 4");
	  Contact temp3 = new Contact("3", "Chester", "Tester", "333-3333", "5 Main St");
       assertEquals(true, tempContact.add(temp1));
       assertEquals(true, tempContact.add(temp3));
       assertEquals(true, tempContact.add(temp2));
       assertEquals(false, tempContact.update("4", "Bad", "Contact", "123-4444", "It worked"));
       assertEquals(true, tempContact.update("2", "Jan", "Dee", "123-2222", "It worked"));
   }
}
