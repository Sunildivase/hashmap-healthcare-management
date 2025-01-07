package com.hashmaphealthcaremanagement.service;

import com.hashmaphealthcaremanagement.model.Person;

import java.util.*;

public class PersonService {

    private static HashMap<Integer,Person> persons = new HashMap<>();

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

        persons.put(1,person);
        return person;
    }
    public void displayPerson(){
        Set<Map.Entry<Integer, Person>> entrySet = persons.entrySet();
        for(Map.Entry<Integer, Person> entry : entrySet){
            System.out.println("key: " +entry.getKey()+"| value: " +entry.getValue());
        }
     }

     public Person deletePerson(int personId){
        Person removedPerson =persons.remove(personId);
         System.out.println("removed person: "+removedPerson);
         return removedPerson;
     }
     public void deleteAllPerson(){
        persons.clear();
     }
    }

