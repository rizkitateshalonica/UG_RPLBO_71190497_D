package com.cug9;

public abstract class PhysicalCharacter extends Character{
    private int armor;

    public PhysicalCharacter(String name, int health, int damage, int armor) {
        super(name, health, damage);
        this.armor = armor;
    }

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Armor\t: " + this.armor);
        System.out.println("\n");
    }

    @Override
    public void attacked(int totalDamage) {
        int total;
        total = totalDamage - this.armor;
        this.health -= total;
    }
}
