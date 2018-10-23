package com.netcracker.edu.barkun.controller.factory;

import com.netcracker.edu.barkun.domain.equipment.Ammunition;
import com.netcracker.edu.barkun.domain.equipment.Helmet;
import com.netcracker.edu.barkun.domain.equipment.enums.TypeHelmet;

public class HelmetFactory  {

    private static HelmetFactory instance = new HelmetFactory();

    private HelmetFactory(){

    }

    public static HelmetFactory getInstance() {
        return instance;
    }

    public Ammunition createAmmunition(double price, String tittle, int size, TypeHelmet type) {
        return new Helmet(type,price,tittle,size);
    }
}
