package com.example.internmanagement.service;

import com.example.internmanagement.entity.Role;
import com.example.internmanagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    // Insert a new role
    public Role insertRole(Role role) {
        return roleRepository.save(role);
    }

    // Show all roles
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    // Show role by ID
    public Optional<Role> getRoleById(Long id) {
        return roleRepository.findById(id);
    }

    // Remove role by ID
    public void deleteRoleById(Long id) {
        roleRepository.deleteById(id);
    }
}