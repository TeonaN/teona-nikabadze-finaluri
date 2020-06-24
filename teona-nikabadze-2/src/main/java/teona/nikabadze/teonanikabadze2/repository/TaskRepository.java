package teona.nikabadze.teonanikabadze2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teona.nikabadze.teonanikabadze2.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
