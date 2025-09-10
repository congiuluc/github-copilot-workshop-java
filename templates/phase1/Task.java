package com.customer.taskmanager.model;

import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

/**
 * Template for Task model class
 * Use this as a starting point for Phase 1: Code Completions
 * 
 * Instructions:
 * 1. Let GitHub Copilot suggest field declarations after typing comments
 * 2. Use Tab to accept suggestions, Esc to reject them  
 * 3. Try typing "private" and see what Copilot suggests
 * 4. Add constructors, getters, and setters using Copilot completions
 */
public class Task {
    
    // TODO: Add fields using GitHub Copilot suggestions
    // Fields to include:
    // - id (Long)
    // - title (String, required, max 100 chars)
    // - description (String, max 500 chars)
    // - priority (Priority enum)
    // - status (TaskStatus enum)
    // - createdDate (LocalDateTime)
    // - dueDate (LocalDateTime)
    // - assigneeId (Long)
    
    // TODO: Add constructors using Copilot
    
    // TODO: Add getters and setters using Copilot
    
    // TODO: Add business logic methods using Copilot:
    // - isOverdue(): boolean
    // - getDaysUntilDue(): long
    // - canBeAssignedTo(User user): boolean
    
    // TODO: Add utility methods using Copilot:
    // - toString()
    // - equals() and hashCode()
}
