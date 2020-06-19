package spells;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@EqualsAndHashCode
@NonFinal
public class Spell {

    enum DamageType {
        PHYSICAL,
        FROST,
        FIRE,
        SHADOW,
        AIR
    }

    String name;
    int requiredLevel;
    DamageType damageType;
    StatusEffect statusEffect;
    double damageLow, damageHigh, setStatusChance;
    int cost;

}
