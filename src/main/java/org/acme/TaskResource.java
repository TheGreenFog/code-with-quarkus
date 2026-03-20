package org.acme;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/tasks")
@Produces("application/json")
@Consumes("application/json")
public class TaskResource {
    private static List<Task> tasks = new ArrayList<>();

    @GET
    public List<Task> getTasks() {
        return tasks;
    }   

    @POST
    public Task addTask(Task task) {
        task.setId(tasks.size() + 1);
        tasks.add(task);
        return task;
    }


}
