/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.easykanban;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Easykanban {

    public static void main(String[] args) {
    // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        // Login
        String username = JOptionPane.showInputDialog("Enter username");
        String password = JOptionPane.showInputDialog("Enter password");
        if (!password.equals("Zymasefrough") || !username.equals("mpumi123")) {
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        } else {
            // Get number of tasks
            int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter?"));

            // Task loop
            for (int i = 0; i < numTasks; i++) {
                // Get task details
                String taskName = JOptionPane.showInputDialog("Enter task name");
                String taskNumber = JOptionPane.showInputDialog("Enter task number");
                String taskDescription = JOptionPane.showInputDialog("Enter task description");
                String developerDetails = JOptionPane.showInputDialog("Enter developer details");
                int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration"));
                String taskID = JOptionPane.showInputDialog("Enter task ID");
                String taskStatus = JOptionPane.showInputDialog("Enter task status");

                // Display task details
                JOptionPane.showMessageDialog(null, "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID + "\nDuration: " + taskDuration);

                // Accumulate total hours
                int totalHours = 0;
                totalHours += taskDuration;
                JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
            }

            // Menu loop
            while (true) {
                int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose an option: \n1. Add tasks \n2. Show report \n3. Quit"));
                switch (choice) {
                    case 1 -> {
                        // Add tasks
                        int numNewTasks = Integer.parseInt(JOptionPane.showInputDialog("How many new tasks do you want to enter?"));
                        for (int i = 0; i < numNewTasks; i++) {
                            // Get task details
                            String newTaskName = JOptionPane.showInputDialog("Enter new task name");
                            String newTaskNumber = JOptionPane.showInputDialog("Enter new task number");
                            String newTaskDescription = JOptionPane.showInputDialog("Enter new task description");
                            String newDeveloperDetails = JOptionPane.showInputDialog("Enter new developer details");
                            int newTaskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter new task duration"));
                            String newTaskID = JOptionPane.showInputDialog("Enter new task ID");
                            String newTaskStatus = JOptionPane.showInputDialog("Enter new task status");

                            // Display task details
                            JOptionPane.showMessageDialog(null, "Task Status: " + newTaskStatus + "\nDeveloper Details: " + newDeveloperDetails + "\nTask Number: " + newTaskNumber + "\nTask Name: " + newTaskName + "\nTask Description: " + newTaskDescription + "\nTask ID: " + newTaskID + "\nDuration: " + newTaskDuration);
                        }
                    }
                    case 2 -> // Show report
                        JOptionPane.showMessageDialog(null, "Coming soon...");
                    case 3 -> // Quit
                        System.exit(0);
                    default -> JOptionPane.showMessageDialog(null, "Invalid choice");
                }
            }
        }
    }
}

