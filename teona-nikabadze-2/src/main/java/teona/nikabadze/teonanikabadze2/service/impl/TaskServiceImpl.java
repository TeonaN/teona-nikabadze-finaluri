package teona.nikabadze.teonanikabadze2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teona.nikabadze.teonanikabadze2.dto.Task.*;
import teona.nikabadze.teonanikabadze2.model.Task;
import teona.nikabadze.teonanikabadze2.repository.TaskRepository;
import teona.nikabadze.teonanikabadze2.service.TaskService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {

        List<TaskDTO> taskDTOList = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            taskDTOList.add(taskDTO);
        }

        GetTasksOutput getTasksOutput = new GetTasksOutput();
        getTasksOutput.setTasks(taskDTOList);
        return getTasksOutput;
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());


        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("დაემატა");
        return addTaskOutput;
    }


    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = taskRepository.getOne(deleteTaskInput.getTaskId());
        taskRepository.delete(task);

        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMsg("წარმატებით წაიშალა");
        return deleteTaskOutput;
    }
}
