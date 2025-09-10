package com.customer.taskmanager.mapper;

import com.customer.taskmanager.model.Task;
import com.customer.taskmanager.dto.TaskDTO;
import com.customer.taskmanager.dto.TaskCreateDTO;
import com.customer.taskmanager.dto.TaskUpdateDTO;

/**
 * 🔍 Phase 5: Code Review Template
 * Mapper class for converting between Task entities and DTOs
 * 
 * 🎯 Code Review Instructions:
 * 1. Use GitHub Copilot's code review feature to analyze this code
 * 2. Trigger reviews with Ctrl+Shift+P → "GitHub Copilot: Review and Comment"
 * 3. Look for potential improvements in:
 *    - Security vulnerabilities
 *    - Performance issues
 *    - Code maintainability
 *    - Best practices compliance
 * 
 * 🔍 Review Focus Areas:
 * - Null safety and defensive programming
 * - Performance optimization opportunities
 * - Security considerations in data mapping
 * - Code complexity and maintainability
 * - Best practices for mapper implementations
 */
public class TaskMapper {

    // TODO: Select this method and brush it to "Add null safety checks"
    public static TaskDTO toDTO(Task task) {
        TaskDTO dto = new TaskDTO();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setPriority(task.getPriority().toString());
        dto.setStatus(task.getStatus().toString());
        dto.setCreatedDate(task.getCreatedDate());
        dto.setDueDate(task.getDueDate());
        dto.setAssigneeId(task.getAssigneeId());
        return dto;
    }

    // TODO: Select this method and brush it to "Convert to builder pattern"
    public static Task fromCreateDTO(TaskCreateDTO createDTO) {
        Task task = new Task();
        task.setTitle(createDTO.getTitle());
        task.setDescription(createDTO.getDescription());
        task.setPriority(Priority.valueOf(createDTO.getPriority()));
        task.setStatus(TaskStatus.TODO);
        task.setCreatedDate(LocalDateTime.now());
        task.setDueDate(createDTO.getDueDate());
        task.setAssigneeId(createDTO.getAssigneeId());
        return task;
    }

    // TODO: Select this method and brush it to "Add validation and error handling"
    public static void updateFromDTO(Task task, TaskUpdateDTO updateDTO) {
        task.setTitle(updateDTO.getTitle());
        task.setDescription(updateDTO.getDescription());
        task.setPriority(Priority.valueOf(updateDTO.getPriority()));
        task.setStatus(TaskStatus.valueOf(updateDTO.getStatus()));
        task.setDueDate(updateDTO.getDueDate());
        task.setAssigneeId(updateDTO.getAssigneeId());
    }

    // TODO: Select the entire class and brush it to "Add comprehensive documentation"
    // TODO: Select method parameters and brush to "Add parameter validation"
    // TODO: Select return statements and brush to "Add defensive copying"
}
