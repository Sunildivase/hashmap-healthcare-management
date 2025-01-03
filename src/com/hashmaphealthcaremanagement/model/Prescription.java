package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Prescription {

    private int pId;
    private int personId;
    private String pDetails;

    @Override
    public String toString() {
        return "Prescription{" +
                "pId=" + pId +
                ", personId=" + personId +
                ", pDetails='" + pDetails + '\'' +
                '}';
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getpDetails() {
        return pDetails;
    }

    public void setpDetails(String pDetails) {
        this.pDetails = pDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return getpId() == that.getpId() && getPersonId() == that.getPersonId() && Objects.equals(getpDetails(), that.getpDetails());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getpId(), getPersonId(), getpDetails());
    }
}
