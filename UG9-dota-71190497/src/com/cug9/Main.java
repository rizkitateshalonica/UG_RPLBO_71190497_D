package com.cug9;

public class Main {
    public static void main(String[] args) {
        Lina luna = new Lina("Luna", 800, 70, 120);
        DragonKnight dragonKnight = new DragonKnight("Dragon Knight", 1800, 95, 50);
        LegionCommander legionCommander = new LegionCommander("Legion Commander", 1200, 120, 30);

        luna.skill(dragonKnight);
        dragonKnight.skill();
        dragonKnight.attack(luna);
        dragonKnight.attack(luna);
        legionCommander.skill(luna);
        luna.skill(legionCommander);
        luna.showCharacterInfo();
        dragonKnight.showCharacterInfo();
        legionCommander.showCharacterInfo();
    }
}
