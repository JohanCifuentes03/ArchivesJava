package archives;

import entity.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Archive {

    public void createArchive(String archiveName) {
        File archive = new File(archiveName);
        try {
            PrintWriter exit = new PrintWriter(archive);
            exit.close();
        }catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }


    public void addEmployees(String archiveName, List<Employee> employees){
        File archive = new File(archiveName);
        try{
            PrintWriter io = new PrintWriter(archive);
            for (Employee employee : employees){
                io.println("----------------------");
                io.println("ID: " + employee.getId());
                io.println("Name: "+ employee.getName());
                io.println("Last Name: " + employee.getLastName());
                io.println("Age: " + employee.getAge());
                io.println("----------------------");
            }
            io.close();
        }catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }

    public void addEmployee(String archiveName, Employee employee){
        File archive = new File(archiveName);
        try{
            PrintWriter io = new PrintWriter(archive);
            io.println("----------------------");
            io.println("ID: " + employee.getId());
            io.println("Name: "+ employee.getName());
            io.println("Last Name: " + employee.getLastName());
            io.println("Age: " + employee.getAge());
            io.println("----------------------");
            io.close();
        }catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }

}
