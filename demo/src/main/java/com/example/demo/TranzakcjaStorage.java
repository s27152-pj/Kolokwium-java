package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class TranzakcjaStorage {


    public void addTranzakcja(Tranzakcja tranzakcja) {
    }

    @Component
    public class tranzakcjaStorage {

        private List<Tranzakcja> TranzakcjaList;

        public tranzakcjaStorage() {
            this.TranzakcjaList = new ArrayList<>();
        }

        public List<Tranzakcja> getTranzakcjaList() {
            return TranzakcjaList;
        }

        public void addTranzakcja(Tranzakcja tranzakcja) {
            TranzakcjaList.add(tranzakcja);
        }
    }
}