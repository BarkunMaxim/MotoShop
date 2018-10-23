package com.netcracker.edu.barkun.controller.sort;

import com.netcracker.edu.barkun.domain.equipment.Ammunition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingByParams {

    private List<Ammunition> list = new ArrayList<>();

    private static SortingByParams instance = new SortingByParams();

    private SortingByParams(){

    }

    public static SortingByParams getInstance(){
        return instance;
    }

    public boolean sortingByPrice(List<Ammunition> list){
        this.list = list;
        try {
            this.list.sort(Comparator.comparing(Ammunition::getPrice));
            return  true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean sortingByTittle(List<Ammunition> list){
        this.list = list;
        try {
            this.list.sort(Comparator.comparing(Ammunition::getTittle));
            return  true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean sortingBySize(List<Ammunition> list){
        this.list = list;
        try {
            this.list.sort(Comparator.comparing(Ammunition::getSize));
            return  true;
        }catch (Exception e){
            return false;
        }
    }
}
