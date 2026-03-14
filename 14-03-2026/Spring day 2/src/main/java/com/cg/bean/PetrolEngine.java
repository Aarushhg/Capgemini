package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine {
//    public String getEngine(){
//        return "Petrol Engine";
//    }
    @Override
    public String getBHP(){
        return "150 BHP";
    }

}
