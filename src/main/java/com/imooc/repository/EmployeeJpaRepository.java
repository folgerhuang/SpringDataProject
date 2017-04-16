package com.imooc.repository;

import com.imooc.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by root on 2017/4/16.
 */
public interface EmployeeJpaRepository extends JpaRepository<Employee,Integer> {
}
