package com.hashmaphealthcaremanagement.service;

import com.hashmaphealthcaremanagement.model.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PersonService {

    private static HashSet<Person> persons = new HashSet<>();

    private static Scanner scanner = new Scanner(System.in);

    void printPerson(Person person){
        System.out.println(person);
    }
    public Person createPerson(){

        System.out.println("please enter id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter first name");
        String fName= scanner.nextLine();

        System.out.println("please enter last name");
        String lName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter mobile number");
        String mobileNo = scanner.nextLine();

        System.out.println("please enter alternate mobile");
        String alternateMobile = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setType(type);
        person.setfName(fName);
        person.setlName(lName);
        person.setAge(age);
        person.setGender(gender);
        person.setMobileNo(mobileNo);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);

        persons.add(person);
        return person;
    }
    public void displayPerson(){
     for(Object person: persons){
         System.out.println("person created: "+person);
     }
    }
}
