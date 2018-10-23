package com.netcracker.edu.barkun.controller.factory;

import com.netcracker.edu.barkun.domain.equipment.Ammunition;
import com.netcracker.edu.barkun.domain.equipment.Gloves;
import com.netcracker.edu.barkun.domain.equipment.enums.TypeMaterial;

public class GlovesFactory  {

    private static GlovesFactory instance = new GlovesFactory();

    private GlovesFactory(){

    }

    public static GlovesFactory getInstance() {
        return instance;
    }

    public Ammunition createAmmunition(double price, String tittle, int size, TypeMaterial type) {

        return new Gloves(type,price,tittle,size);
    }
}
