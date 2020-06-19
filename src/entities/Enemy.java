package entities;


import items.Item;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import spells.Spell;

import java.util.ArrayList;
import java.util.Random;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
public class Enemy extends Entity{

    private ArrayList<Spell> availableSpells;
    private ArrayList<Item> drops;
    private int level;

    public Spell castSpell() {
        Random rand = new Random();
        int spellNum = rand.nextInt(availableSpells.size());
        return availableSpells.get(spellNum);
    }

}
