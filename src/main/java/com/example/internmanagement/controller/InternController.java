package com.example.internmanagement.controller;

import com.example.internmanagement.entity.Intern;
import com.example.internmanagement.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interns")
public class InternController {
    @Autowired
    private InternService internService;

    @GetMapping
    public List<Intern> getAllInterns() {
        return internService.getAllInterns();
    }

    @GetMapping("/{id}")
    public Intern getInternById(@PathVariable Long id) {
        return internService.getInternById(id);
    }

    @PostMapping
    public Intern createIntern(@RequestBody Intern intern) {
        return internService.createIntern(intern);
    }

    @DeleteMapping("/{id}")
    public void deleteIntern(@PathVariable Long id) {
        internService.deleteIntern(id);
    }
}
