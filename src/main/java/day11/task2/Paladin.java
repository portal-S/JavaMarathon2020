package day11.task2;

public class Paladin extends Hero implements PhysAttack,Healer{

    public Paladin(){
        this.health = 100;
        this.physAtt = 15;
        this.magicAtt = 0;
        this.physDef = 0.5;
        this.magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        health+=25;
        if(health > 100) health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health+=10;
        if(hero.health > 100) hero.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (this.physAtt * hero.physDef);
        if(hero.health < 0) hero.health = 0;
    }
}
