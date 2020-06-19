package items;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.NonFinal;

@EqualsAndHashCode(callSuper = true)
@Value
@NonFinal
public class Weapon extends Item{

    public enum Type {
        STAFF,
        DAGGER,
        SWORD
    }

    double damageLow, damageHigh;
    Type type;
    int agility, stamina, strength, intellect;

}
