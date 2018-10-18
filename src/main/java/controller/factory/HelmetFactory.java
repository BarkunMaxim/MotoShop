package controller.factory;

import domain.equipment.Ammunition;
import domain.equipment.Helmet;
import domain.equipment.enums.TypeHelmet;

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
