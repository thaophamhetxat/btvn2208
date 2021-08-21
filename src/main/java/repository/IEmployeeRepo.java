package repository;

import moduls.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;


public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {

    @Query(value = "select c from Employee c where c.name like concat('%',:name,'%')")
    ArrayList<Employee> findAllByName(@Param("name") String name);
}