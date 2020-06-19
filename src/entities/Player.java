package entities;

import items.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import resource.Resource;
import spells.Spell;
import spells.StatusEffect;

import java.util.ArrayList;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Player extends Entity{

    private Chest equippedChest;
    private Helm equippedHelm;
    private Legs equippedLegs;
    private Boots equippedBoots;

    private Weapon equippedWeapon;

    private ArrayList<Item> backPack;
    private ArrayList<Spell> equippedSpells;
    private ArrayList<Spell> learnedSpells;
    private Resource resource;

    public Player(Chest chest, Helm helm, Legs legs, Boots boots, Weapon weapon, int health, String name, Class chosenClass) {
        super(chosenClass, name, health, health, new StatusEffect(StatusEffect.Type.NONE, 0));
        equippedBoots = boots;
        equippedChest = chest;
        equippedHelm = helm;
        equippedLegs = legs;
        equippedWeapon = weapon;

        backPack = new ArrayList<>();
        learnedSpells = new ArrayList<>();
        equippedSpells = new ArrayList<>();

        switch (chosenClass) {
            case MAGE:
                resource = new Resource(Resource.Type.MANA);
                break;
            case ROGUE:
                resource = new Resource(Resource.Type.ENERGY);
                break;
            case WARRIOR:
                resource = new Resource(Resource.Type.RAGE);
                break;
            default:
            break;
        }

    }

    public int getMaxResource() {
        return resource.getMaxAmount();
    }
    public int getCurrentResource() {
        return resource.getCurrentAmount();
    }
}
