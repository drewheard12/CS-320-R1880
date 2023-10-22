package task;

import java.util.ArrayList;

public class TaskService {
   //variables
   private ArrayList<Task> TaskArr;

   // constructor
   public TaskService() {
       TaskArr = new ArrayList<>();
   }

   public boolean add(Task task) {
       boolean checker = false;
       for (Task temp : TaskArr) {
           if (temp.equals(task)) {
               checker = true;
           }
       }
       if (checker == false) {
           TaskArr.add(task);
           System.out.println("Task added to database.");
           return true;
       } 
       else {
           System.out.println("Task already exists.");
           return false;
       }
   }

   public boolean remove(String ID) {
       for (Task temp : TaskArr) {
           if (temp.getid().equals(ID)) {
               TaskArr.remove(temp);
               System.out.println("Task removed.");
               return true;
           }
       }
       System.out.println("Task not found.");
       return false;
   }

   public boolean update(String id, String name, String desc) {
       for (Task temp : TaskArr) {
           if (temp.getid().equals(id)) {
               if (!name.equals(""))
                   temp.setName(name);
               if (!desc.equals(""))
                   temp.setDesc(desc);
               System.out.println("Task updated.");
               return true;
           }
       }
       System.out.println("Task not found.");
       return false;
   }

}