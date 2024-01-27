package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
@Service
public class bankService {

    int wartosc;

    public bankService(com.example.demo.customerStorage customerStorage, TranzakcjaStorage tranzakcjaStorage) {
        this.customerStorage = customerStorage;
        this.tranzakcjaStorage = tranzakcjaStorage;
    }

    private final customerStorage customerStorage;

    private final TranzakcjaStorage tranzakcjaStorage;

    public String Rejestracja(String name, int id, int saldo) {
        customer customer = new customer(name, id, saldo);
        customerStorage.addCustomer(customer);
        return "Zarejestrowany";
    }


    public customer wyswietl(int customerId) {
        customer customer = null;
        for (customer c : customerStorage.getcustomerList()) {
            if (c.getId() == customerId) {
                customer = c;
            }
        }
        if (customer == null) {
            throw new NoSuchElementException();
        } else {
            return customer;
        }
    }

    public customer findCustomerById(int id) {
        customer customer = null;
        for (customer c : customerStorage.getcustomerList()) {
            if (c.getId() == id) {
                customer = c;
            }
        }
        return customer;
    }

    public String Tranzakcja(int id,int saldo){
        customer customer = findCustomerById(id);
        if (customer.getSaldo() - saldo > 0) {
            Tranzakcja tranzakcja = new Tranzakcja(customer, saldo);
            customer.setSaldo(customer.getSaldo() - saldo);
            tranzakcja.setStatus(status.ACCEPTED);
            tranzakcjaStorage.addTranzakcja(tranzakcja);
            return "Status :" + status.ACCEPTED + tranzakcja.getCustomer().getSaldo();
        }
        else{
            return "Status :" + status.DECLINED;
        }
    }

    public String Wplata(int id,int saldo){
        customer customer = findCustomerById(id);
        if (customer.getSaldo() - saldo > 0) {
            Tranzakcja tranzakcja = new Tranzakcja(customer, saldo);
            customer.setSaldo(customer.getSaldo() + saldo);
            tranzakcja.setStatus(status.ACCEPTED);
            tranzakcjaStorage.addTranzakcja(tranzakcja);
            return "Status :" + status.ACCEPTED + tranzakcja.getCustomer().getSaldo();
        }
        else{
            return "Status :" + status.DECLINED;
        }
    }

}




