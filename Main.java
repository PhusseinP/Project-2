import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static ArrayList<String> listOfTasks = new ArrayList<>();

public static Scanner input = new Scanner(System.in);




    public static int promptUser() {
        System.out.println("Please select one.\n");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
        System.out.println("Which task would you like to do?");
        int task = input.nextInt();
        input.nextLine();

        return task;
    }
    public static void removeTask() {
        System.out.println("Remove your task 0-" + listOfTasks.size());
        int task = input.nextInt();
        input.nextLine();
        listOfTasks.remove(task);
        System.out.println(listOfTasks);


    }
    public static void updateTask() {
        System.out.println(listOfTasks);
        System.out.println("What task would use like to update? 0-" + listOfTasks.size());
        int updatedList = input.nextInt();
        System.out.println("Please add a description:");
        String descriptionTask = input.nextLine();
        descriptionTask = input.nextLine();

        listOfTasks.set(updatedList, descriptionTask);
    }

    public static void addTask() {
        System.out.println("Whats your new task name?");
        String taskName = input.nextLine();

        System.out.println("Give a Description of your new task..");
        String taskDescription = input.nextLine();

        System.out.println("Give a Priority for your new task..");
        int taskPriority = input.nextInt();
        input.nextLine();

        Task thenewone = new Task(taskName,taskDescription,taskPriority);
    }






    public static ArrayList returnList() {
        for (int i = 0; i < listOfTasks.size(); i++) {
            System.out.printf(i + ": " + listOfTasks.get(i) + "\n");
        }

        return listOfTasks;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);





        int task = promptUser();
        while (true) {
            switch (task) {
                case 1:
                    addTask();
                    task = promptUser();
                    break;
                case 2:
                    removeTask();
                    task = promptUser();
                    break;
                case 3:
                    updateTask();
                    task = promptUser();
                    break;
                case 4:
                    returnList();
                    task = promptUser();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a valid number");
                    promptUser();
                    break;


            }

        }
    }
}