package com.cug9;

public abstract class Character implements ObjectAttack {
    protected int damage, health;
    protected String name;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void showCharacterInfo() {
        System.out.println("Hero\t: " + this.name);
        System.out.println("Health\t: " + this.health);
        System.out.println("Damage\t: " + this.damage);
    }

    public boolean isDie() {
        boolean cek = true;
        if (this.health <= 0){
            cek = true;
        }
        return cek;
    }

    public void attacked(int totalDamage) {
        this.health -= totalDamage;
    }
}
