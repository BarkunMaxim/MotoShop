package controller.factory;

import domain.equipment.Ammunition;
import domain.equipment.Helmet;
import domain.equipment.enums.TypeHelmet;

public class HelmetFactory  {

    public Ammunition createAmmunition(double price, String tittle, int size, TypeHelmet type) {
        return new Helmet(type,price,tittle,size);
    }
}
