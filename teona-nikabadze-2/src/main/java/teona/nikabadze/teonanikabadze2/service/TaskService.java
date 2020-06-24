package teona.nikabadze.teonanikabadze2.service;

import teona.nikabadze.teonanikabadze2.dto.Task.*;

public interface TaskService {
    GetTasksOutput getTasks(GetTasksInput getTasksInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);


}
