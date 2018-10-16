package domain.equipment;

import domain.equipment.enums.StyleType;
import lombok.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Shoes extends Ammunition {


    private StyleType styleType;

    public Shoes(StyleType styleType, double price, String tittle, int size){
        this.styleType = styleType;
        this.price = price;
        this.tittle = tittle;
        this.size = size;
    }
}
