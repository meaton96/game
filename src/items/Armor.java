package items;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.NonFinal;

@EqualsAndHashCode(callSuper = true)
@Value
@NonFinal
public class Armor extends Item{

    public enum Type {
        CLOTH,
        LEATHER,
        PLATE
    }

    double armor;
    Type type;
    int stamina, strength, agility, intellect;

}
