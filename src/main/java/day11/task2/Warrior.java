package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public Warrior(){
        this.health = 100;
        this.physAtt = 30;
        this.magicAtt = 0;
        this.physDef = 0.2;
        this.magicDef = 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (this.physAtt * hero.physDef);
        if(hero.health < 0) hero.health = 0;
    }
}
