package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Doctor {

    private int doctorId;
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private String contactNo;
    private String speciality;
    private int experience;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", speciality='" + speciality + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return getDoctorId() == doctor.getDoctorId() && getAge() == doctor.getAge() && getExperience() == doctor.getExperience() && Objects.equals(getfName(), doctor.getfName()) && Objects.equals(getlName(), doctor.getlName()) && Objects.equals(getGender(), doctor.getGender()) && Objects.equals(getContactNo(), doctor.getContactNo()) && Objects.equals(getSpeciality(), doctor.getSpeciality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDoctorId(), getfName(), getlName(), getAge(), getGender(), getContactNo(), getSpeciality(), getExperience());
    }
}
