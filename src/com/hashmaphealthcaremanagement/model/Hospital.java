package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Hospital {

    private int hId;
    private String hName;
    private String hAddress;
    private String contactNo;
    private String emailId;

    @Override
    public String toString() {
        return "Hospital{" +
                "hId=" + hId +
                ", hName='" + hName + '\'' +
                ", hAddress='" + hAddress + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethAddress() {
        return hAddress;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return gethId() == hospital.gethId() && Objects.equals(gethName(), hospital.gethName()) && Objects.equals(gethAddress(), hospital.gethAddress()) && Objects.equals(getContactNo(), hospital.getContactNo()) && Objects.equals(getEmailId(), hospital.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(gethId(), gethName(), gethAddress(), getContactNo(), getEmailId());
    }
}
