package domain.equipment;

import domain.equipment.enums.TypeHelmet;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Helmet extends Ammunition {

    private TypeHelmet typeHelmet;

    public Helmet(TypeHelmet typeHelmet,double price, String tittle, int size){
        this.typeHelmet = typeHelmet;
        this.price = price;
        this.tittle = tittle;
        this.size = size;
    }

}
