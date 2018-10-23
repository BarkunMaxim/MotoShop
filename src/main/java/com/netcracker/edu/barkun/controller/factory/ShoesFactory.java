package com.netcracker.edu.barkun.controller.factory;

import com.netcracker.edu.barkun.domain.equipment.Ammunition;
import com.netcracker.edu.barkun.domain.equipment.Shoes;
import com.netcracker.edu.barkun.domain.equipment.enums.StyleType;

public class ShoesFactory  {

    private static ShoesFactory instance = new ShoesFactory();

    private  ShoesFactory (){

    }

    public static ShoesFactory getInstance() {
        return instance;
    }

    public Ammunition createAmmunition(double price, String tittle, int size, StyleType type) {
        return new Shoes(type,price,tittle,size);
    }
}
