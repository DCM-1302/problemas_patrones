package Problem_IV;

public class EditTask implements Command {
    private TaskManager taskManager;
    private String task;
    private String newContent;
    private String previousContent;

    public EditTask(TaskManager taskManager, String task, String newContent) {
        this.taskManager = taskManager;
        this.task = task;
        this.newContent = newContent;
        this.previousContent = taskManager.getTask(task);
    }

    @Override
    public void execute() {
        taskManager.editTask(task, newContent);
    }

    @Override
    public void undo() {
        taskManager.editTask(task, previousContent);
    }
}
