package controller.factory;

import domain.equipment.Ammunition;
import domain.equipment.Gloves;
import domain.equipment.enums.TypeMaterial;

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
