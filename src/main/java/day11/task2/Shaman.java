package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer{

    public Shaman(){
        this.health = 100;
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 0.8;
        this.magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        health+=50;
        if(health > 100) health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health+=30;
        if(hero.health > 100) hero.health = 100;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (this.magicAtt * hero.magicDef);
        if(hero.health < 0) hero.health = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (this.physAtt * hero.physDef);
        if(hero.health < 0) hero.health = 0;
    }
}
