package com.edstem.repository;

import com.edstem.model.Task;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);

    List<Task> findByAssigneeId(Long assigneeId);

    Object findTaskById(long l);
}
