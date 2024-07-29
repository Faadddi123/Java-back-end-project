package com.example.internmanagement.controller;

import com.example.internmanagement.entity.Assignment;
import com.example.internmanagement.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    // Insert a new assignment
    @PostMapping
    public ResponseEntity<Assignment> insertAssignment(@RequestBody Assignment assignment) {
        Assignment savedAssignment = assignmentService.insertAssignment(assignment);
        return ResponseEntity.ok(savedAssignment);
    }

    // Show all assignments
    @GetMapping
    public ResponseEntity<List<Assignment>> getAllAssignments() {
        List<Assignment> assignments = assignmentService.getAllAssignments();
        return ResponseEntity.ok(assignments);
    }

    // Show assignment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Assignment>> getAssignmentById(@PathVariable Long id) {
        Optional<Assignment> assignment = assignmentService.getAssignmentById(id);
        return assignment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Remove assignment by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAssignmentById(@PathVariable Long id) {
        assignmentService.deleteAssignmentById(id);
        return ResponseEntity.noContent().build();
    }
}