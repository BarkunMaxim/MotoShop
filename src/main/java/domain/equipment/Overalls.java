package domain.equipment;

import domain.equipment.enums.TypeSeason;
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
public class Overalls extends Ammunition {

    private TypeSeason typeSeasonOveralls;

    public Overalls(TypeSeason typeSeasonOveralls, double price, String tittle, int size){
        this.typeSeasonOveralls = typeSeasonOveralls;
        this.price = price;
        this.tittle = tittle;
        this.size = size;
    }
}
