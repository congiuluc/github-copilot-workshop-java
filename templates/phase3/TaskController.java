package com.customer.taskmanager.controller;

import com.customer.taskmanager.model.Task;
import com.customer.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

/**
 * ⚡ Phase 3: Inline Chat Template
 * REST Controller for task management operations
 * 
 * 🎯 Inline Chat Instructions:
 * 1. Select code blocks and use Ctrl+I for inline chat
 * 2. Select method signatures and ask for implementation
 * 3. Select TODO comments and ask for completion
 * 4. Highlight code sections and ask for improvements
 * 
 * 💡 Example Inline Chat Prompts:
 * - Select a method: "Add error handling to this method"
 * - Select parameters: "Add validation for these parameters"
 * - Select return type: "Convert this to use ResponseEntity"
 * - Select class: "Add proper REST annotations"
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // TODO: Select this comment and use inline chat to generate the method
    // Prompt: "Generate a POST method to create a new task"
    
    // TODO: Select this comment and use inline chat
    // Prompt: "Generate a GET method to retrieve a task by ID with proper error handling"
    
    // TODO: Select this comment and use inline chat
    // Prompt: "Generate a PUT method to update an existing task"
    
    // TODO: Select this comment and use inline chat
    // Prompt: "Generate a DELETE method to remove a task"
    
    // TODO: Select this comment and use inline chat
    // Prompt: "Generate a GET method to list all tasks with pagination"
    
    // TODO: Select this comment and use inline chat
    // Prompt: "Generate a GET method to search tasks by keyword"
    
    // Select the entire class and ask: "Add proper exception handling"
    // Select method parameters and ask: "Add validation annotations"
    // Select return types and ask: "Use proper HTTP status codes"
}
