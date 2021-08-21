package service;

import moduls.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import repository.IEmployeeRepo;
import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
@Transactional
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    @Override
    public Employee save(Employee employee) {
        return iEmployeeRepo.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return iEmployeeRepo.findById(id).get();
    }

    @Override
    public ArrayList<Employee> findAll() {
        return (ArrayList<Employee>) iEmployeeRepo.findAll();
    }

    @Override
    public ArrayList<Employee> findAllByName(String name) {
        return iEmployeeRepo.findAllByName(name);
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepo.findAll(pageable);
    }

    @Override
    public void delete(Employee employee) {
        iEmployeeRepo.delete(employee);
    }

    @Override
    public void edit(Employee employee) {
        iEmployeeRepo.save(employee);
    }
}

