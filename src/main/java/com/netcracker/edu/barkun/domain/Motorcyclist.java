package com.netcracker.edu.barkun.domain;

import com.netcracker.edu.barkun.domain.equipment.Gloves;
import com.netcracker.edu.barkun.domain.equipment.Helmet;
import com.netcracker.edu.barkun.domain.equipment.Overalls;
import com.netcracker.edu.barkun.domain.equipment.Shoes;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Motorcyclist {

    private String name;
    private Helmet helmet;
    private Overalls overalls;
    private Gloves gloves;
    private Shoes shoes;


}
