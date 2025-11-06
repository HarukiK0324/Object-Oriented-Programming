package oop.ex3B3;

public class Task implements Comparable<Task> {
    private int priority;
    private String description;
    
    public Task(int priority, String description)
    {
        this.priority = priority;
        this.description = description;
    }

    @Override
    public String toString()
    {
        return this.priority + " " + this.description;
    }

    public int compareTo(Task other)
    {
        return this.priority - other.priority;
    }
}
