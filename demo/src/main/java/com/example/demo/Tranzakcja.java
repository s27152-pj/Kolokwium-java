package com.example.demo;

public class Tranzakcja {
    private customer customer;
    private int saldo;
    private status status;

    public Tranzakcja(customer customer, int saldo) {
        this.customer = customer;
        this.saldo = saldo;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;

    }

    public int getSaldo() {
        return saldo;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }
}
