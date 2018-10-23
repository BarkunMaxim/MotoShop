package com.netcracker.edu.barkun.controller.search;

import com.netcracker.edu.barkun.domain.equipment.Ammunition;

import java.util.ArrayList;
import java.util.List;

public class SearchByParams {

    private static SearchByParams instance = new SearchByParams();

    private SearchByParams(){

    }
    public static SearchByParams getInstance(){
        return instance;
    }


    public List<Ammunition> search(List<Ammunition> list, double price, int size) {

        List<Ammunition> ammunitionList = new ArrayList<>();

        for(Ammunition iterator: list){
            if(iterator.getPrice() == price && iterator.getSize() == size) {
                ammunitionList.add(iterator);
            }
        }
        return ammunitionList;
    }

    public List<Ammunition> searchByRangePrice(List<Ammunition> list, double min, int max) {

        List<Ammunition> ammunitionList = new ArrayList<>();

        for(Ammunition iterator: list){
            if(iterator.getPrice() > min && iterator.getPrice() < max) {
                ammunitionList.add(iterator);
            }
        }
        return ammunitionList;
    }
    public List<Ammunition> searchByRangeSize(List<Ammunition> list, double min, int max) {

        List<Ammunition> ammunitionList = new ArrayList<>();

        for(Ammunition iterator: list){
            if(iterator.getSize() > min && iterator.getSize() < max) {
                ammunitionList.add(iterator);
            }
        }
        return ammunitionList;
    }
}
