package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class bankServiceTest {

    @Test
    void Rejestracja() {

    }
    @Test
    void wyswietl(){

    }

    @Test
    void findCustomerByID(){

    }

    @Test
    void Tranzakcja(){

    }

    @Test
    void Wplata(){

    }

    @Mock
    private customerStorage customerStorage;

    @InjectMocks
    private bankService bankService;
}
