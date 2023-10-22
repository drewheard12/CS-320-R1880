package contact;

import java.util.ArrayList;

public class ContactService {
   //variables
   private ArrayList<Contact> contactArr;

   // constructor
   public ContactService() {
       contactArr = new ArrayList<>();
   }

   public boolean add(Contact contact) {
       boolean checker = false;
       for (Contact temp : contactArr) {
           if (temp.equals(contact)) {
               checker = true;
           }
       }
       if (checker == false) {
           contactArr.add(contact);
           System.out.println("Contact added.");
           return true;
       } else {
           System.out.println("Contact info already exists");
           return false;
       }
   }

   
   public boolean remove(String ID) {
       for (Contact temp : contactArr) {
           if (temp.getid().equals(ID)) {
               contactArr.remove(temp);
               System.out.println("Contact removed.");
               return true;
           }
       }
       System.out.println("Contact does not exist.");
       return false;
   }

 
   public boolean update(String id, String firstName, String lastName, String phoneNum, String Address) {
       for (Contact temp : contactArr) {
           if (temp.getid().equals(id)) {
               if (!firstName.equals(""))
                   temp.setFirstName(firstName);
               if (!lastName.equals(""))
                   temp.setLastName(lastName);
               if (!Address.equals(""))
                   temp.setAddress(phoneNum);
               if (!Address.equals(""))
                   temp.setAddress(Address);
               System.out.println("Contact updated.");
               return true;
           }
       }
       System.out.println("Contact does not exist.");
       return false;
   }

}