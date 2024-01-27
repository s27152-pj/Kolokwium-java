package com.example.demo;
import java.util.ArrayList;
import java.util.List;

public class customerStorage {


        private List<customer> customerList;
        public customerStorage(){
            this.customerList = new ArrayList<>();
        }
        public void addCustomer(customer customer) {
            customerList.add(customer);
        }
        public List<customer> getcustomerList() {
            return customerList;
        }
        public void clearData() {
            customerList.clear();
        }
}
