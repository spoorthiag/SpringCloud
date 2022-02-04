package com.spoorthi.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spoorthi.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

	public Department findByDepartmentId(Long departmentId);

}
