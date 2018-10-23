package com.netcracker.edu.barkun.view;

import com.netcracker.edu.barkun.controller.Operator;
import com.netcracker.edu.barkun.domain.Motorcyclist;
import com.netcracker.edu.barkun.domain.equipment.*;

import java.util.List;

public class ConsoleView {

    public void showMotocyclist(Motorcyclist motorcyclist){
        System.out.println(motorcyclist.toString());
    }
    public void showHelmetList(List<Ammunition> list){
        Helmet helmet = null;
        for(Ammunition iterator : list){
            helmet = (Helmet) iterator;
            System.out.println("Шлем: " + helmet.getTittle() + ", " + helmet.getTypeHelmet() + ", " + helmet.getPrice()
                                + " бел. руб., " + helmet.getSize());
        }
    }
    public void showOverralsList(List<Ammunition> list){
        Overalls overalls = null;
        for(Ammunition iterator : list){
            overalls = (Overalls) iterator;
            System.out.println("Комбинизон: " + overalls.getTittle() + ", " + overalls.getTypeSeasonOveralls() + ", "
                    + overalls.getPrice() + " бел. руб., " + overalls.getSize());
        }
    }
    public void showGlovesList(List<Ammunition> list){
        Gloves gloves = null;
        for(Ammunition iterator : list){
            gloves = (Gloves) iterator;
            System.out.println("Перчатки: " + gloves.getTittle() + ", " + gloves.getTypeMaterial() + ", "
                    + gloves.getPrice() + " бел. руб., " + gloves.getSize());
        }
    }

    public void showShoesList(List<Ammunition> list){
        Shoes shoes = null;
        for(Ammunition iterator : list){
            shoes = (Shoes) iterator;
            System.out.println("Обувь: " + shoes.getTittle() + ", " + shoes.getStyleType() + ", "
                    + shoes.getPrice() + " бел. руб., " + shoes.getSize());
        }
    }
    public void showFinalCost(Motorcyclist motorcyclist){
        Operator operator = Operator.getInstance();
        System.out.println("Сумма амуниции = " + operator.getFinalPrice(motorcyclist) + "бел. руб.");

    }
}
