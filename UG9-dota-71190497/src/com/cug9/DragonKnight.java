package com.cug9;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill {
    private int dragonFormAttack;

    public DragonKnight(String name, int health, int damage, int armor) {
        super(name, health, damage, armor);
    }

    @Override
    public void skill() {
        this.dragonFormAttack = 2;
    }

    @Override
    public void attack(Character character) {
        character.attacked(this.damage);
        if (this.dragonFormAttack > 0) {
            character.damage += 90;
            this.dragonFormAttack -= 1;
        }
    }
}
