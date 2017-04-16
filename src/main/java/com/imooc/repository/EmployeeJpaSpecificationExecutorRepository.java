package com.imooc.repository;

import com.imooc.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by root on 2017/4/16.
 */
public interface EmployeeJpaSpecificationExecutorRepository extends JpaSpecificationExecutor<Employee>,JpaRepository<Employee,Integer> {
}
