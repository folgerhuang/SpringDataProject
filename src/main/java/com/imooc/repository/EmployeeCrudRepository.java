package com.imooc.repository;

import com.imooc.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by root on 2017/4/16.
 */
public interface EmployeeCrudRepository extends CrudRepository<Employee,Integer> {
}
