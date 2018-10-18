package controller.factory;

import domain.equipment.Ammunition;
import domain.equipment.Overalls;
import domain.equipment.enums.TypeSeason;

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
