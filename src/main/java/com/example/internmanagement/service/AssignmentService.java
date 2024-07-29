package com.example.internmanagement.service;

import com.example.internmanagement.entity.Assignment;
import com.example.internmanagement.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;

    // Insert a new assignment
    public Assignment insertAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    // Show all assignments
    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    // Show assignment by ID
    public Optional<Assignment> getAssignmentById(Long id) {
        return assignmentRepository.findById(id);
    }

    // Remove assignment by ID
    public void deleteAssignmentById(Long id) {
        assignmentRepository.deleteById(id);
    }
}