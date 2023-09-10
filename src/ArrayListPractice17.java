import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice17 {
    public static void main(String[] args) {
        //Tasks app
        Scanner sc = new Scanner(System.in);
        List<String> tasklist = new ArrayList<>();
        boolean isRunning = true;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1) Add a task");
            System.out.println("2) Complete the task");
            System.out.println("3) Print all the tasks");
            System.out.println("4) quit");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("add a task") || input.equals("1")) {
                System.out.println("Enter your task");
                String task = sc.nextLine();
                tasklist.add(task);
            } else if (input.equalsIgnoreCase("complete the task") || input.equals("2")){
                System.out.println("Enter the task you completed");
                String taskCompleted = sc.nextLine();
                //remove int index
                for (int i = 0; i < tasklist.size(); i++) {
                    if (tasklist.get(i).equalsIgnoreCase(taskCompleted)) {
                        tasklist.remove(i);
                    }
                }

            }else if (input.equalsIgnoreCase("print all the task") || input.equals("3")) {
                System.out.println(tasklist);
            } else if (input.equalsIgnoreCase("quite") || input.equals("4")) {
                isRunning = false;
            } else {
                System.out.println("Error1");
            }
        } while (isRunning);

    }
}
