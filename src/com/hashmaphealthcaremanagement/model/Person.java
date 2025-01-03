package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Person {

    private int personId;
    private String type;
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private String mobileNo;
    private String alternateMobile;
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", type='" + type + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", alternateMobile='" + alternateMobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getPersonId() == person.getPersonId() && getAge() == person.getAge() && Objects.equals(getType(), person.getType()) && Objects.equals(getfName(), person.getfName()) && Objects.equals(getlName(), person.getlName()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getMobileNo(), person.getMobileNo()) && Objects.equals(getAlternateMobile(), person.getAlternateMobile()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getType(), getfName(), getlName(), getAge(), getGender(), getMobileNo(), getAlternateMobile(), getAddress());
    }
}
