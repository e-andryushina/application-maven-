import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
//        final String user = "student";
//        final String password = "student";
//        final String url = "jdbc:postgresql://localhost:5432/skypro";

//        try (Connection connection = DriverManager.getConnection(url, user, password);
//             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")) {
//            statement.setInt(1, 6);
//            final ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                String firstName = "Firstname: " + resultSet.getString("first_name");
//                String lastName = "Lastname: " + resultSet.getString("last_name");
//                String gender = "Gender: " + resultSet.getString("gender");
//                int age = resultSet.getInt(5);
//                int cityId = resultSet.getInt(6);
//
//                System.out.println(firstName);
//                System.out.println(lastName);
//                System.out.println(gender);
//                System.out.println("Age: " + age);
//                System.out.println("City ID: " + cityId);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            EmployeeDAO employeeDAO = new EmployeeDAOImpl(connection);
//           City city = new City(1, "Rome");
//           City city2 = new City(3, "Moscow");
//        Employee employee1 = new Employee(7, "Petr", "Ivanov", "m", 34, city);
//        Employee employee2 = new Employee(8, "Ivan", "Rybin", "m", 46, city);
//        Employee employee3 = new Employee(7, "Maria", "Smirnova", "f", 23, city2);
//        Employee employee4 = new Employee(8, "Inna", "Novikova", "f", 43, city2);

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee5 = new Employee(10, "Aleftina", "Semenova", "f", 37, 2);

            employeeDAO.create(employee5);

        List<Employee> list = employeeDAO.getAll();
            for (Employee employee : list) {
                System.out.println(employee);
            }

            System.out.println(employeeDAO.getById(10));
        Employee employee2 = new Employee(8, "Sergey", "Rybin", "m", 46, 1);
            employeeDAO.update(employee2);
            employeeDAO.delete(employee5);
        }
    }


