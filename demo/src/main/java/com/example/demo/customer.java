package com.example.demo;

public class customer {
    String name;
    int id;
    int saldo;

    public customer(String name, int id, int saldo) {
        this.name = name;
        this.id = id;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


}
