import archives.Archive;
import entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Archive archive = new Archive();
        //archive.createArchive("EmployeesList.txt");
        employees = fillList(employees);


        archive.addEmployees("EmployeesList.txt",employees);
        Employee employeeTest = new Employee("Julian", "Alvarez", 19, 11);
        archive.addEmployee("EmployeesList.txt",employeeTest);
    }

    public static List<Employee> fillList(List<Employee> employees){
        Employee Employee1 = new Employee("Johan", "Cifuentes", 19, 1);
        Employee Employee2 = new Employee("María", "González", 25, 2);
        Employee Employee3 = new Employee("Carlos", "López", 30, 3);
        Employee Employee4 = new Employee("Laura", "Rodríguez", 28, 4);
        Employee Employee5 = new Employee("Pedro", "Sánchez", 32, 5);
        Employee Employee6 = new Employee("Ana", "Martínez", 27, 6);
        Employee Employee7 = new Employee("Luis", "Hernández", 23, 7);
        Employee Employee8 = new Employee("Sara", "Pérez", 31, 8);
        Employee Employee9 = new Employee("Andrés", "Vargas", 26, 9);
        Employee Employee10 = new Employee("Isabel", "Ramírez", 29, 10);
        employees.add(Employee1);
        employees.add(Employee2);
        employees.add(Employee3);
        employees.add(Employee4);
        employees.add(Employee5);
        employees.add(Employee6);
        employees.add(Employee7);
        employees.add(Employee8);
        employees.add(Employee9);
        employees.add(Employee10);
        return employees;
    }
}