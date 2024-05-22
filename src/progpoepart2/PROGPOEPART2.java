/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progpoepart2;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class PROGPOEPART2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Welcome to Mhlambi's Branch
        
      JOptionPane.showMessageDialog(null, "Welcome to Mhlambi's Branch");
      int menuOption = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n1. Add tasks \n2. show report \n3. Quit"));
      
      while (menuOption != 3) {
       switch (menuOption) {
        case 1 -> {
            // Add tasks feature
            int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks to add:"));
            for (int i = 0; i < numTasks; i++) {
                Task task = new Task();
                task.setTaskName(JOptionPane.showInputDialog("Enter task name:"));
                task.setTaskDescription(JOptionPane.showInputDialog("Enter task description "));
                task.setDeveloperDetails(JOptionPane.showInputDialog("Enter developer details:"));
                task.setTaskDuration(Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (hours):")));
                task.setTaskStatus(JOptionPane.showInputDialog("Enter task status (To Do, Doing, Done):"));
                task.setTaskID(createTaskID(task.getTaskName(), i));
                JOptionPane.showMessageDialog(null, "Task successfully captured");
            }    }
        case 2 -> // Show report feature (coming soon)
         JOptionPane.showMessageDialog(null, "Coming soon");
        default -> JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
       }
       menuOption = Integer.parseInt(JOptionPane.showInputDialog("Select an option:\n1. Add tasks \n2. Show report \n3. Quit"));
      }
    }
    
    private static String createTaskID(String taskName, int taskNumber) {
     return taskName.substring(0, 2 ).toLowerCase() + ":" + taskNumber + ":" + taskName.substring(taskName.length() - 3).toUpperCase();
    }
   }

class Task {
  private String taskName;
  private String taskDescription;
  private String developerDetails;
  private int taskDuration;
  private String taskStatus;
  private String taskID;
  
  // Getters and setters 
  public String getTaskName() {
     return taskName;
  }
  
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }
  
  public String getTaskDescription() {
    return taskDescription;
  }
  
  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }
          
  public String getDeveloperDetails() {
    return developerDetails;
  }
  
  public void setDeveloperDetails(String developerDetails) {
    this.developerDetails = developerDetails;
  }
  
  public int getTaskDuration() {
    return taskDuration;
  }
  
  public void setTaskDuration(int taskDuration) {
    this.taskDuration = taskDuration;
  }
  
  public String getTaskStatus() {
    return taskStatus;
  }
  
  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }
  
  public String getTaskID() {
    return taskID;
  }
  
  public void setTaskID(String taskID) {
    this.taskID = taskID;
  }
}