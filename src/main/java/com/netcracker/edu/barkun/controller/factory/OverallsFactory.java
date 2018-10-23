package com.netcracker.edu.barkun.controller.factory;

import com.netcracker.edu.barkun.domain.equipment.Ammunition;
import com.netcracker.edu.barkun.domain.equipment.Overalls;
import com.netcracker.edu.barkun.domain.equipment.enums.TypeSeason;

public class OverallsFactory  {

    private static OverallsFactory instance = new OverallsFactory();

    private OverallsFactory (){

    }

    public static OverallsFactory getInstance() {
        return instance;
    }

    public Ammunition createAmmunition(double price, String tittle, int size, TypeSeason type) {
        return new Overalls(type,price,tittle,size);
    }
}
