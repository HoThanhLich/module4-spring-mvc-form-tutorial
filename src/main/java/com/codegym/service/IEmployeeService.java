package com.codegym.service;

import com.codegym.model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void create(Employee employee);

    void updateById(int id, Employee employee);

    void deleteById(int id);
}
