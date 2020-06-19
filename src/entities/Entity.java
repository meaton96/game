package entities;

import lombok.*;
import spells.Spell;
import spells.StatusEffect;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Entity {

    public enum Class {
        ROGUE,
        MAGE,
        WARRIOR
    }
    private Class entityClass;
    private String name;
    private int curHealth, maxHealth;
    private StatusEffect statusEffect;

}
