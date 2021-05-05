/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10.example2;

import java.util.ArrayList;

/**
 *
 * @author Raghavendra Reddy
 */
public class PersonDriver {

    public static int count = 0;
    public static ArrayList<Person> list = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        list.add(new Person("John", "Snow"));
        list.add(new Person("Robert", "Stark"));
        list.add(new Person("Eddard", "Stark"));
        list.add(new Person("Sansa", "Stark"));
        list.add(new Person("Sam", "Tully"));
        list.add(new Person("Tony", "Stark"));
        System.out.println(searchPerson("robert"));

    }

    public static String searchPerson(String fName) {

        if (list.get(count).getFirstName().equalsIgnoreCase(fName)) {
            return list.get(count).toString();
        } else {
            if (count == list.size()) {
                return "Person not found";
            }
            count++;
            return searchPerson(fName);
        }
    }

}
