package com.jpa.springormjpa2.repository;

import com.jpa.springormjpa2.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
