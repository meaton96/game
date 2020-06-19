package spells;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class WarriorSpell extends Spell{

    int rageGen;

}
