package com.customer.taskmanager.repository;

import com.customer.taskmanager.model.Task;
import com.customer.taskmanager.model.TaskStatus;
import com.customer.taskmanager.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;
import java.util.List;

/**
 * ⚙️ Phase 4: Slash Commands Template
 * Repository interface for task data access operations
 * 
 * 🎯 Slash Commands Instructions:
 * 1. Type "/" to see available slash commands
 * 2. Use /explain to understand repository patterns
 * 3. Use /tests to generate test methods
 * 4. Use /doc to generate documentation
 * 5. Use /fix to resolve any issues
 * 
 * 💡 Try These Slash Commands:
 * - /explain "What is the Repository pattern?"
 * - /tests "Generate tests for this repository"
 * - /doc "Document these query methods"
 * - /optimize "Suggest performance improvements"
 */
public interface TaskRepository extends JpaRepository<Task, Long> {

    // TODO: Use slash commands to generate these methods:
    
    // Basic query methods - Use /explain to understand method naming
    // findByStatus(TaskStatus status): List<Task>
    // findByPriority(Priority priority): List<Task>
    // findByAssigneeId(Long assigneeId): List<Task>
    
    // Date-based queries - Use /doc to document these
    // findByDueDateBefore(LocalDateTime date): List<Task>
    // findByCreatedDateBetween(LocalDateTime start, LocalDateTime end): List<Task>
    
    // Complex queries - Use /tests to generate test cases
    // @Query("SELECT t FROM Task t WHERE t.title LIKE %:keyword% OR t.description LIKE %:keyword%")
    // findByKeyword(@Param("keyword") String keyword): List<Task>
    
    // Custom native queries - Use /optimize for performance tuning
    // @Query(value = "SELECT * FROM tasks WHERE status = ?1 AND priority = ?2", nativeQuery = true)
    // findByStatusAndPriority(String status, String priority): List<Task>
    
    // Use /explain to understand the difference between JPQL and native queries
    // Use /fix if there are any compilation issues
}
