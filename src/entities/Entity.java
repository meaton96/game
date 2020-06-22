package entities;

import javafx.scene.image.Image;
import lombok.*;
import spells.StatusEffect;

@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public abstract class Entity {

    public enum Class {
        ROGUE,
        MAGE,
        WARRIOR
    }

    private final Class entityClass;
    private final String name;
    private int curHealth, maxHealth;
    private StatusEffect statusEffect;
    private final Image model;

}
