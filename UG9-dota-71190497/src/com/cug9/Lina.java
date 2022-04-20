package com.cug9;

public class Lina extends MagicCharacter implements TargetSkill {
    public Lina(String name, int health, int damage, int mana) {
        super(name, health, damage, mana);
    }

    @Override
    public boolean skill(Character character) {
        boolean jalankan = true;
        if (this.mana >= 60) {
            jalankan = true;
            character.attacked(600);
            this.mana -= 60;
        }
        else {
            jalankan = false;
        }
        return jalankan;
    }

    @Override
    public void attack(Character character) {
        character.attacked(this.damage);
        if (character.isDie()) {
            this.mana += 45;
        }
    }

}
