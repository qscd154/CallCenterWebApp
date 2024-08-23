package com.kst.csr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kst.csr.model.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

}
