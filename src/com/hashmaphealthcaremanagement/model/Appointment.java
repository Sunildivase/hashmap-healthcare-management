package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Appointment {

    private int aId;
    private int PersonId;
    private int doctorId;
    private int hId;
    private int deptId;

    @Override
    public String toString() {
        return "Appointment{" +
                "aId=" + aId +
                ", PersonId=" + PersonId +
                ", doctorId=" + doctorId +
                ", hId=" + hId +
                ", deptId=" + deptId +
                '}';
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return getaId() == that.getaId() && getPersonId() == that.getPersonId() && getDoctorId() == that.getDoctorId() && gethId() == that.gethId() && getDeptId() == that.getDeptId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getaId(), getPersonId(), getDoctorId(), gethId(), getDeptId());
    }
}
