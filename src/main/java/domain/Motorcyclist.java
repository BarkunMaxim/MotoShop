package domain;

import domain.equipment.Gloves;
import domain.equipment.Helmet;
import domain.equipment.Overalls;
import domain.equipment.Shoes;
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
