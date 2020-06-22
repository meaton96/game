package items;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.experimental.NonFinal;

@EqualsAndHashCode(callSuper = true)
@NonFinal
public class Weapon extends Item {

    @Builder
    public Weapon(String name, double weight, double durability, int level, double damageLow, double damageHigh,
                  Type type, int agility, int stamina, int strength, int intellect) {
        super(name, weight, durability, level);
        this.damageHigh = damageHigh;
        this.damageLow = damageLow;
        this.type = type;
        this.agility = agility;
        this.stamina = stamina;
        this.strength = strength;
        this.intellect = intellect;
    }

    public enum Type {
        STAFF,
        DAGGER,
        SWORD
    }

    private final double damageLow, damageHigh;
    private final Type type;
    private final int agility, stamina, strength, intellect;

}
