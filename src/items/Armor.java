package items;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public abstract class Armor extends Item {

    public Armor(String name, double weight, double durability, int level, double armor, Type type,
                 int stamina, int strength, int agility, int intellect) {
        super(name, weight, durability, level);
        this.armor = armor;
        this.agility = agility;
        this.type = type;
        this.stamina = stamina;
        this.strength = strength;
        this.intellect = intellect;
    }

    public enum Type {
        CLOTH,
        LEATHER,
        PLATE
    }

    private final double armor;
    private final Type type;
    private final int stamina, strength, agility, intellect;

}
