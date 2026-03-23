package com.cg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.beans.BeanProperty;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalServiceTest {
    CalculatorService service;
    @BeforeEach
    public void init() {
        ICalculate cal= Mockito.mock(ICalculate.class);
        service= new CalculatorService(cal);
        when(cal.calculate(20,5)).thenReturn(25);
        when(cal.calculate(10,5)).thenReturn(15);
    }
    @Test
    void addService(){
        assertEquals(15,service.addService(10,5));
    }

}
