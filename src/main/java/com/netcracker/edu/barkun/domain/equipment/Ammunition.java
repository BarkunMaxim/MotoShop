package com.netcracker.edu.barkun.domain.equipment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public abstract class Ammunition {

    protected double price;
    protected String tittle;
    protected int size;

}
