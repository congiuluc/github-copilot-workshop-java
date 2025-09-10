package com.customer.taskmanager.service;

import com.customer.taskmanager.model.Task;
import java.util.List;
import java.util.Optional;

/**
 * 💬 Phase 2: Copilot Chat Template
 * Service interface for task management operations
 * 
 * 🎯 Copilot Chat Instructions:
 * 1. Use Copilot Chat to generate method implementations
 * 2. Ask: "Generate CRUD methods for this TaskService interface"
 * 3. Ask: "Add search and filtering methods"
 * 4. Ask: "Add business logic methods for task management"
 * 5. Use chat to explain design patterns and best practices
 * 
 * 💡 Example Chat Prompts:
 * - "What validation should I add to task creation?"
 * - "How should I handle task dependencies?"
 * - "Generate pagination support for task listing"
 * - "Add methods for task status transitions"
 */
public interface TaskService {
    
    // TODO: Use Copilot Chat to generate these methods:
    
    // Basic CRUD Operations
    // - createTask(Task task): Task
    // - getTaskById(Long id): Optional<Task>
    // - updateTask(Task task): Task
    // - deleteTask(Long id): void
    // - getAllTasks(): List<Task>
    
    // Search and Filtering
    // - getTasksByAssignee(Long assigneeId): List<Task>
    // - getTasksByStatus(TaskStatus status): List<Task>
    // - getTasksByPriority(Priority priority): List<Task>
    // - searchTasks(String keyword): List<Task>
    
    // Business Logic
    // - assignTask(Long taskId, Long assigneeId): Task
    // - markTaskComplete(Long taskId): Task
    // - getOverdueTasks(): List<Task>
    // - getTasksForUser(Long userId): List<Task>
    
    // Ask Copilot Chat: "Generate method signatures for this interface"
}
