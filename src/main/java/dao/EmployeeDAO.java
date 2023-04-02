package dao;

import model.City;
import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void create (Employee employee);
    Employee getById (int id);
    List<Employee> getAll ();
    void updateByID(int id, String lastName);
    void deleteById(int id);
}
