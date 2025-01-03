package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Department {

    private int deptId;
    private String deptName;
    private int doctorId;
    private int hId;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", doctorId=" + doctorId +
                ", hId=" + hId +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return getDeptId() == that.getDeptId() && getDoctorId() == that.getDoctorId() && gethId() == that.gethId() && Objects.equals(getDeptName(), that.getDeptName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptId(), getDeptName(), getDoctorId(), gethId());
    }
}
