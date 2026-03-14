package com.cg.bean;

import org.springframework.stereotype.Component;

@Component("JKTyre")
public class JKTyre implements ITyre {
    public String getTyreDetails(){
        return "JKTyre";
    }
}
