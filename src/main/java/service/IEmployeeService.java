package service;

import moduls.Employee;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.ArrayList;

public interface IEmployeeService {
    Employee save(Employee employee);
    Employee findById(int id);

    ArrayList<Employee> findAll();

    ArrayList<Employee> findAllByName(String name);

    Page<Employee> findAll(Pageable pageable);

    void delete(Employee employee);

    void edit(Employee employee);
}
