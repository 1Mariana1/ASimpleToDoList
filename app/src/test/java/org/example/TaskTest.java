package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskTest {

    @Test
    void taskStartsIncomplete() {
        Task task = new Task("Buy milk");

        assertFalse(task.isCompleted());
    }

    @Test
    void maskAsCompleteChangesStatus() {
        Task task = new Task("Buy milk");

        task.markAsComplete();

        assertTrue(task.isCompleted());
    }

}
