package com.hashmaphealthcaremanagement;

import com.hashmaphealthcaremanagement.model.Person;
import com.hashmaphealthcaremanagement.service.DoctorService;
import com.hashmaphealthcaremanagement.service.PersonService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapHealthcareDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Map<Integer,String > testPerson = new HashMap<>();

        String Person = "";
        testPerson.put(1, Person);

        int option = 0;
        do {
            System.out.println("-----------------healthcare-management-system------------------");
            System.out.println("1. create person");
            System.out.println("2. create doctor");

            System.out.println("please enter the option");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    PersonService personService = new PersonService();
                    personService.createPerson();
                    personService.displayPerson();
                    personService.deletePerson(1);
                    personService.deleteAllPerson();
                    System.out.println("person created successfully");
                    break;

                case 2:
                    DoctorService doctorService =new DoctorService();
                    doctorService.createDoctor();
                    doctorService.displayDoctor();
                    doctorService.deleteDoctor(1);
                    doctorService.deleteAllDoctor();
                    System.out.println("doctor created successfully");
            }

        }while(option!=0);{
            System.out.println("Thank you !!!");
        }

    }
}
