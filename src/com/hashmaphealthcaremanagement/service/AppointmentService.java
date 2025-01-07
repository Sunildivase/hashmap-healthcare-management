package com.hashmaphealthcaremanagement.service;

import com.hashmaphealthcaremanagement.model.Appointment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppointmentService {

    Scanner scanner = new Scanner(System.in);

    Map<Integer, Appointment> appointments = new HashMap<>();

    void printAppointment(Appointment appointment){
        System.out.println(appointment);
    }

    public Appointment createAppointment(){
        System.out.println("please enter appointment id");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department id");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPersonId(personId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);

        appointments.put(1,appointment);
        return appointment;
    }
    public void displayAppointment(){
        Set<Map.Entry<Integer,Appointment>> entrySet = appointments.entrySet();
        for(Map.Entry<Integer,Appointment> appointmentEntry : entrySet){
            System.out.println("key: "+appointmentEntry.getKey()+"|value: "+appointmentEntry.getValue());
        }
    }
    public Appointment deleteAppointment(int appointmentId){
       Appointment removeAppointment = appointments.remove(appointmentId);
       System.out.println("removed appointment: "+removeAppointment);
       return removeAppointment;
    }
    public void deleteAllAppointment(){
        appointments.clear();
    }
}
