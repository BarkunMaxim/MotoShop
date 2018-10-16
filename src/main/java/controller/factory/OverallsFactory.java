package controller.factory;

import domain.equipment.Ammunition;
import domain.equipment.Overalls;
import domain.equipment.enums.TypeSeason;

public class OverallsFactory  {


    public Ammunition createAmmunition(double price, String tittle, int size, TypeSeason type) {
        return new Overalls(type,price,tittle,size);
    }
}
