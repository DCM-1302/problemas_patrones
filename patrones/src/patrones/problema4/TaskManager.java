package Problem_IV;

public class TaskManager {
    public void createTask(String task) {
        System.out.println("Task created: " + task);
    }

    public void deleteTask(String task) {
        System.out.println("Task deleted: " + task);
    }

    public void editTask(String task, String newContent) {
        System.out.println("Task edited\nPrevious State: " + task + "\nCurrent State: " + newContent);
    }

    public void completeTask(String task) {
        System.out.println("Task completed: " + task);
    }

    public void uncompleteTask(String task) {
        System.out.println("Task pending: " + task);
    }

    public String getTask(String task) {
        return task;
    }
}
