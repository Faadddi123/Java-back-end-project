package com.example.internmanagement.repository;

import com.example.internmanagement.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern, Long> {
}
