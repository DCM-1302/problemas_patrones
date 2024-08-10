package Problem_IV;

public class ServiceManager {
    private CommandManager commandManager;
    private TaskManager taskManager;

    public ServiceManager() {
        this.commandManager = new CommandManager();
        this.taskManager = new TaskManager();
    }

    public void createTask(String task) {
        Command createTask = new NewTask(taskManager, task);
        commandManager.executeCommand(createTask);
    }

    public void editTask(String task, String newContent) {
        Command editTask = new EditTask(taskManager, task, newContent);
        commandManager.executeCommand(editTask);
    }

    public void deleteTask(String task) {
        Command deleteTask = new DeleteTask(taskManager, task);
        commandManager.executeCommand(deleteTask);
    }

    public void completeTask(String task) {
        Command completeTask = new CompleteTask(taskManager, task);
        commandManager.executeCommand(completeTask);
    }

    public void undoLastAction() {
        commandManager.undoLastCommand();
    }
}
