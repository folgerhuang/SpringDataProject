package com.imooc.repository;

import com.imooc.domain.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by root on 2017/4/16.
 */
public interface EmployeePagingAndSortRepository extends PagingAndSortingRepository<Employee,Integer> {
}
