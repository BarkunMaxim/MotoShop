package controller.factory;

import domain.equipment.Ammunition;
import domain.equipment.Shoes;
import domain.equipment.enums.StyleType;

public class ShoesFactory  {


    public Ammunition createAmmunition(double price, String tittle, int size, StyleType type) {
        return new Shoes(type,price,tittle,size);
    }
}
