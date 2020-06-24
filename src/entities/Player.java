package entities;

import items.*;
import javafx.scene.image.Image;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import resource.Resource;
import spells.Spell;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)

public class Player extends Entity {

    private Chest equippedChest;
    private Helm equippedHelm;
    private Legs equippedLegs;
    private Boots equippedBoots;

    private Weapon equippedWeapon;

    private List<Item> backPack;
    private List<Spell> equippedSpells;
    private List<Spell> learnedSpells;
    private Resource resource;

    @Builder
    public Player(Chest chest, Helm helm, Legs legs, Boots boots, Weapon weapon, int health, String name, Class chosenClass, Image model) {
        super(chosenClass, name, health, health, null, model);
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
