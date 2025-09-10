package com.customer.taskmanager.mapper;

import com.customer.taskmanager.model.Task;
import com.customer.taskmanager.dto.TaskDTO;
import com.customer.taskmanager.dto.TaskCreateDTO;
import com.customer.taskmanager.dto.TaskUpdateDTO;

/**
 * 🎨 Phase 5: Code Brushes Template
 * Mapper class for converting between Task entities and DTOs
 * 
 * 🎯 Code Brushes Instructions:
 * 1. Select code sections visually with your cursor
 * 2. Use Copilot's brush tool to transform selected code
 * 3. Apply different transformation patterns:
 *    - Convert to builder pattern
 *    - Add null safety checks
 *    - Transform to fluent interface
 *    - Add validation logic
 * 
 * 🎨 Brush Transformation Examples:
 * - Select assignment block → "Convert to builder pattern"
 * - Select method → "Add null safety"
 * - Select class → "Add fluent interface"
 * - Select validation → "Use Bean Validation"
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
