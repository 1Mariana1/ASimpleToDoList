package org.example;
import java.util.ArrayList;

public class TaskList {

    private final ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void add(String description) {
        if (description == null || description.isBlank()) {
            System.out.println("Task description cannot be empty.");
            return;
        }

        tasks.add(new Task(description));
    }

    public void complete(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.markAsComplete();
                return;
            }
        }

        System.out.println("Task not found.");
    }

    public void all() {
        if (tasks.isEmpty()) {
            System.out.println("no tasks in list.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

        public void completed() {
        boolean found = false;

        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No completed tasks.");
        }
    }

    public void incomplete() {
        boolean found = false;

        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No incomplete tasks.");
        }
    }

    public void clear() {
        tasks.clear();
    }

}
