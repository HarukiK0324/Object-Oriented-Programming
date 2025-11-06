package oop.ex3B3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TaskList {

    List<Task> tasks;

    public TaskList()
    {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task t)
    {
        tasks.add(t);
    }

    public void printList()
    {
        Collections.sort(tasks);
        for (Task t : tasks) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public boolean removeTask(int index)
    {
        if(index < 0 || index >= tasks.size())
            return false;
        tasks.remove(index - 1);
        return true;
    }
}
