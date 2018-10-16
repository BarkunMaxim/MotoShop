package controller;

import domain.Motorcyclist;

public class Operator implements Cost {

    private static Operator instance = new Operator();

    private Operator(){

    }

    public static Operator getInstance(){
        return instance;
    }
    public double getFinalPrice(Motorcyclist motorcyclist) {
        return (motorcyclist.getHelmet().getPrice() + motorcyclist.getGloves().getPrice()
                + motorcyclist.getOveralls().getPrice() + motorcyclist.getShoes().getPrice());
    }
}
