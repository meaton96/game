package control;

public class Game {/*
    private final Chest[] STARTING_CHESTS;
    private final Helm[] STARTING_HELMS;
    private final Legs[] STARTING_LEGS;
    private final Weapon[] STARTING_WEAPONS;
    private final Boots[] STARTING_BOOTS;

    private final Player player;
*/

    /**
     * game constructor
     *
     * @param classNumber number for the class choice
     *                    1 - warrior
     *                    2 - rogue
     *                    3 - mage
     * @param name        name chosen by the user
     */
    public Game(int classNumber, String name) {

        ArmorFileReader.init();

/*
        STARTING_CHESTS = new Chest[3];
        STARTING_BOOTS = new Boots[3];
        STARTING_HELMS = new Helm[3];
        STARTING_WEAPONS = new Weapon[3];
        STARTING_LEGS = new Legs[3];

        //cloth / leather / plate
        for (int x = 0 ; x < 3; x++) {
            STARTING_CHESTS[x] = Chest.builder()
                    .name("Basic " + Armor.getType(x).toString().toLowerCase() + " Chest")
                    .weight(0)
                    .durability(-1)
                    .level(1)
                    .armor(1)
                    .type(Armor.getType(x))
                    .stamina(1)
                    .strength(1)
        }



        switch (classNumber) {
            case 1 :
                player = Player.builder()
                        .
        }*/

    }


}
