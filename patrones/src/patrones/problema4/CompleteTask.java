package Problem_IV;

public class CompleteTask implements Command {
    private TaskManager taskManager;
    private String task;

    public CompleteTask(TaskManager taskManager, String task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.completeTask(task);
    }

    @Override
    public void undo() {
        taskManager.uncompleteTask(task);
    }
}
