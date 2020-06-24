package teona.nikabadze.teonanikabadze2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import teona.nikabadze.teonanikabadze2.model.Task;
import teona.nikabadze.teonanikabadze2.repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    TaskRepository taskRepository;




    @GetMapping("addTask")
    public void addPostWithCategoryAndAttachment() {


        Task task = new Task();
        task.setTitle("task");
        task.setDescription("task description");


        taskRepository.save(task);
    }

    @GetMapping("getTasks")
    public void getTasks() {
        for (Task task : taskRepository.findAll()) {
            System.out.println(task);
       }
    }



}
