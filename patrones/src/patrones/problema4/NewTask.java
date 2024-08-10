package Problem_IV;

public class NewTask implements Command {
    private TaskManager taskManager;
    private String task;

    public NewTask(TaskManager taskManager, String task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.createTask(task);
    }

    @Override
    public void undo() {
        taskManager.deleteTask(task);
    }
}
