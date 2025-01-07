package com.hashmaphealthcaremanagement.service;

import com.hashmaphealthcaremanagement.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HospitalService {

    Scanner scanner = new Scanner(System.in);

    Map<Integer, Hospital> hospitals = new HashMap<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){

        System.out.println("please enter id ");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name ");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter hospital address ");
        String hospitalAddress = scanner.nextLine();

        System.out.println("please enter contact number");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email id");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);

        hospitals.put(1,hospital);
        return hospital;

    }
    public void displayHospital(){

        Set<Map.Entry<Integer,Hospital>> entrySet = hospitals.entrySet();
        for(Map.Entry<Integer,Hospital> hospitalEntry : entrySet){
            System.out.println("key :"+hospitalEntry.getKey()+"| value: "+hospitalEntry.getValue());
        }
    }
    public Hospital deleteHospital(int hospitalId){
      Hospital removedHospital = hospitals.remove(hospitalId);
        System.out.println("removed hospital: "+removedHospital);
      return removedHospital;
    }
    public void deleteAllHospital(){
        hospitals.clear();
    }
}
