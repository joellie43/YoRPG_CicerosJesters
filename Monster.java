//Cicero's Jesters(James Smith, Joelle Lum)
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unleashed
//2016-11-22

public class Monster extends Character{
    public Monster(){	
	hp = 150;
	defense = 20;
	attackRating = 1.0;
	strength = (int)(Math.random()*45 + 20);
    }

    public String about(){
	return "The ugly beast";
    }

    public void specialize(){
    }

    public void normalize(){
    }
}
