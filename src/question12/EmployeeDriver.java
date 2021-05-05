/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Raghavendra Reddy
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> list = new ArrayList<>();
        System.out.println("Answer for question 12: Raghavendra Reddy");

        list.add(new Employee(104, "John Wick", 6000));
        list.add(new Employee(101, "Aaron Finch", 7000));
        list.add(new Employee(105, "Virat Kohli", 8000));
        list.add(new Employee(102, "Chris Evans", 9000));
        list.add(new Employee(107, "Naruto Uzamaki", 4500));
        list.add(new Employee(106, "Shikamaru", 5500));
        list.add(new Employee(103, "Randy Orton", 6500));
        System.out.println("****************Original list**************");
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("*****************Sorted based on id************");
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
            }
        });
        System.out.println("***************Sorted based on salary***********");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return arg0.getEmpName().compareTo(arg1.getEmpName());
            }
        });
        System.out.println("**************Sorted based on name************");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}
