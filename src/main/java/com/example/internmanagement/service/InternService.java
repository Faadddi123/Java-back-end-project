package com.example.internmanagement.service;

import com.example.internmanagement.entity.Intern;
import com.example.internmanagement.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternService {
    @Autowired
    private InternRepository internRepository;

    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    public Intern getInternById(Long id) {
        return internRepository.findById(id).orElse(null);
    }

    public Intern createIntern(Intern intern) {
        return internRepository.save(intern);
    }

    public void deleteIntern(Long id) {
        internRepository.deleteById(id);
    }
}
