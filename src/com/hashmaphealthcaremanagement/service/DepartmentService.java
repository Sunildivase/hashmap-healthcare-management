package com.hashmaphealthcaremanagement.service;

import com.hashmaphealthcaremanagement.model.Department;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentService {

    Scanner scanner = new Scanner(System.in);

    Map<Integer, Department> departments = new HashMap<>();

    void printDepartment(Department department){
        System.out.println(department);
    }
    public Department createDepartment(){

        System.out.println("please enter department id");
        int deptId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.setHospitalId(hospitalId);

        departments.put(1,department);
        return department;
    }
    public void displayDepartment(){

        Set<Map.Entry<Integer,Department >> entrySet = departments.entrySet();
        for(Map.Entry<Integer,Department> departmentEntry: entrySet){
            System.out.println("key: "+departmentEntry.getKey()+"| value: "+departmentEntry.getValue());

        }
    }
    public Department deleteDepartment(int deptId){
        Department removedDepartment = departments.remove(deptId);
        System.out.println("removed department: "+removedDepartment);
        return removedDepartment;
    }
    public void deleteAllDepartment(){
        departments.clear();
    }
}
