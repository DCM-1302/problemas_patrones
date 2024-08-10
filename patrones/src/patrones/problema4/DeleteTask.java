package Problem_IV;

public class DeleteTask implements Command {
    private TaskManager taskManager;
    private String task;

    public DeleteTask(TaskManager taskManager, String task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.deleteTask(task);
    }

    @Override
    public void undo() {
        taskManager.createTask(task);
    }
}
