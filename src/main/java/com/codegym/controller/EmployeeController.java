package com.codegym.controller;

import com.codegym.model.Employee;
import com.codegym.service.EmployeeService;
import com.codegym.service.IEmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
private IEmployeeService employeeService = new EmployeeService();

    @GetMapping
    public ModelAndView showAllEmployee() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("employees", employeeService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("employee", employeeService.findById(id));
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Employee employee) {
        employeeService.create(employee);
        return new ModelAndView("redirect:/employee");
    }

    @PostMapping("/edit")
    public ModelAndView editById(@PathVariable Integer id, @ModelAttribute Employee employee) {
        employeeService.updateById(id, employee);
        return new ModelAndView("redirect:/employee");
    }

}
