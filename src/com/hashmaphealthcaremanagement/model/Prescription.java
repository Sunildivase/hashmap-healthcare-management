package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Prescription {

    private int prescriptionId;
    private int personId;
    private String prescriptionDetails;

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", personId=" + personId +
                ", prescriptionDetails='" + prescriptionDetails + '\'' +
                '}';
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(String prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return getPrescriptionId() == that.getPrescriptionId() && getPersonId() == that.getPersonId() && Objects.equals(getPrescriptionDetails(), that.getPrescriptionDetails());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrescriptionId(), getPersonId(), getPrescriptionDetails());
    }
}
