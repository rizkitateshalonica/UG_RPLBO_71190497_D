package com.cug9;

public abstract class MagicCharacter extends Character {
    protected int mana;

    public MagicCharacter(String name, int health, int damage, int mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    @Override
    public void attacked(int totalDamage) {
        this.health -= totalDamage;
    }

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Mana\t: " + this.mana);
        System.out.println("\n");
    }
}
