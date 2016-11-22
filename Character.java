//Cicero's Jesters(James Smith, Joelle Lum)
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unleashed
//2016-11-22

//General class for all living things

public abstract class Character{
    protected String name;
    protected int hp;
    protected int strength;
    protected int defense;
    protected double attackRating;
    protected boolean isSpec = false;
    
    public boolean isAlive(){
	return (hp > 0);
    }

    public int getDefense(){
	return defense;
    }

    public String getName(){
	return name;
    }

    public void lowerHP(int damage){
	hp-=damage;
    }

    public int attack(Character creep){
	int damage = (int)(strength * attackRating) - creep.getDefense();
	if (damage < 0){
	    damage = 0;
	}
	creep.lowerHP(damage);
	return damage;
    }
    
    public abstract void specialize();

    public abstract void normalize();

    public abstract String about();
}
