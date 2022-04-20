package com.codegym.service;

import com.codegym.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService{
    private static List<Employee> employees;

    static {
        employees = new ArrayList<>();
        employees.add(new Employee(1,"Nguyen Van A","0945231256"));
        employees.add(new Employee(2,"Nguyen Van B","0623569845"));
        employees.add(new Employee(3,"Nguyen Van C","0362024592"));
        employees.add(new Employee(4,"Nguyen Van D","0985123562"));
        employees.add(new Employee(5,"Nguyen Van E","0976125456"));
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findById(int id) {
        return employees.get(id);
    }

    @Override
    public void create(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void updateById(int id, Employee employee) {
        employees.add(id, employee);
    }

    @Override
    public void deleteById(int id) {
        employees.remove(id);
    }
}
