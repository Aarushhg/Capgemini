package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("${carname}")
    private String name;
    @Autowired
//    @Qualifier("petrol")
    @Qualifier("petrolEngine")
    private IEngine engine;
    @Autowired
    @Qualifier("JKTyre")
    private ITyre tyre;

    public Car(){}

    public Car(PetrolEngine petrolEngine, MrfTyre mrfTyre) {
        super();
        this.engine = petrolEngine;
        this.tyre = mrfTyre;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public IEngine getEngine() {
        return engine;
    }
    public void setEngine(IEngine Engine) {
        this.engine = Engine;
    }
    public ITyre getTyre() {
        return tyre;
    }
    public void setTyre(ITyre Tyre) {
        this.tyre = Tyre;
    }

    public void printCar(){
        System.out.println("Car Name: "+name);
        System.out.println("BHP: "+engine.getBHP());
        System.out.println("Tyre Details: "+tyre.getTyreDetails());
    }
}
