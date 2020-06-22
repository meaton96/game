package items;

import lombok.Builder;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Legs extends Armor {
    @Builder
    public Legs(String name, double weight, double durability, int level, double armor, Type type,
                int stamina, int strength, int agility, int intellect) {
        super(name, weight, durability, level, armor, type, stamina, strength, agility, intellect);
    }
}
