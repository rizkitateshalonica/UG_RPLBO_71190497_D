package com.cug9;

public class LegionCommander extends PhysicalCharacter implements TargetSkill {
    private int kill = 0;

    public LegionCommander(String name, int health, int damage, int armor) {
        super(name, health, damage, armor);
    }

    @Override
    public void attack(Character character) {
        character.attacked(this.damage);
        if(character.isDie()) {
            this.kill += 1;
            this.damage += 10;
        }
    }

    @Override
    public boolean skill(Character character) {
        boolean menang = true;
        if (!this.isDie() && !character.isDie()) {
            character.attacked(this.damage);
            this.attacked(character.damage);
            if(character.isDie()) {
                menang = true;
            }
            else {
                menang = false;
            }
        }
        return menang;
    }
}
