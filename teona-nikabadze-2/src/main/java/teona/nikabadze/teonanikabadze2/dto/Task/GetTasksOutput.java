package teona.nikabadze.teonanikabadze2.dto.Task;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {
    private List<TaskDTO> tasks;

}
