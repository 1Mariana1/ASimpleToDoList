package org.example;

public class App {
    public static void main(String[] args) {

        TaskList list = new TaskList();

        list.add("Buy milk");
        list.add("Buy eggs");
        list.add("Prepare a lesson for CSC 122");
        list.add("Sow beet seeds");

        list.complete("Buy eggs");

        System.out.println("\nAll Tasks:");
        list.all();

        System.out.println("\nCompleted Tasks:");
        list.completed();

        System.out.println("\nIncomplete Tasks:");
        list.incomplete();

        list.clear();

        System.out.println("\nAfter Clear:");
        list.all();

    }
}
