package domain.equipment;


import domain.equipment.enums.TypeMaterial;
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
public class Gloves extends Ammunition {
    private TypeMaterial typeMaterial;

    public Gloves(TypeMaterial typeMaterial, double price, String tittle, int size){
        this.typeMaterial = typeMaterial;
        this.price = price;
        this.tittle = tittle;
        this.size = size;
    }
}
