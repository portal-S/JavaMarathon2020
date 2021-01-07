package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{

    public Magician(){
        this.health = 100;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.physDef = 1;
        this.magicDef = 0.2;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
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
