package com.imooc.repository;


import com.imooc.domain.Employee;
import com.imooc.service.EmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class EmployeePagingAndSortRepositoryTest {


    private ApplicationContext ctx = null;
    private EmployeePagingAndSortRepository employeePagingAndSortRepository = null;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        employeePagingAndSortRepository = ctx.getBean(EmployeePagingAndSortRepository.class);
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }

    @Test
    public void testGetAll() {
        Iterable<Employee> all = employeePagingAndSortRepository.findAll();
        for (Employee employee :
                all) {
            System.out.println(employee);
        }
    }

    @Test
    public void testPage() {
        Pageable pageable = new PageRequest(0,5);

        Page<Employee> all = employeePagingAndSortRepository.findAll(pageable);
        System.out.println("total:"+all.getTotalElements());
        for (Employee employee :
                all) {
            System.out.println(employee);

        }
    }

    @Test
    public void testPageAndSort() {
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(0, 5,sort);

        Page<Employee> all = employeePagingAndSortRepository.findAll(pageable);
        System.out.println("total:" + all.getTotalElements());
        for (Employee employee :
                all) {
            System.out.println(employee);

        }
    }


}
