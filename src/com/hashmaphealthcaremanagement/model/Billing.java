package com.hashmaphealthcaremanagement.model;

import java.util.Objects;

public class Billing {

    private int Bid;
    private int bill;
    private int totalBill;
    private int personId;

    @Override
    public String toString() {
        return "Billing{" +
                "Bid=" + Bid +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                ", personId=" + personId +
                '}';
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billing billing = (Billing) o;
        return getBid() == billing.getBid() && getBill() == billing.getBill() && getTotalBill() == billing.getTotalBill() && getPersonId() == billing.getPersonId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBid(), getBill(), getTotalBill(), getPersonId());
    }
}
