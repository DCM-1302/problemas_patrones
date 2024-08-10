package Problem_IV;

public class App {
    public static void main(String[] args) {
        ServiceManager serviceManager = new ServiceManager();

        System.out.println("Testing Task Creation:");
        serviceManager.createTask("Task 1");
        serviceManager.createTask("Task 2");
        
        System.out.println("\nTesting Task Editing:");
        serviceManager.editTask("Task 1", "Updated Task 1");
        
        System.out.println("\nTesting Task Completion:");
        serviceManager.completeTask("Task 1");

        System.out.println("\nTesting Task Deletion:");
        serviceManager.deleteTask("Task 2");
        
        System.out.println("\nTesting Undo Functionality:");
        serviceManager.undoLastAction(); 
        serviceManager.undoLastAction(); 
        serviceManager.undoLastAction(); 
        serviceManager.undoLastAction(); 
    }
}
