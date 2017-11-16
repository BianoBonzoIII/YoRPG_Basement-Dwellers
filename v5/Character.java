/*
  Team Basement Dwellers -- Brian, George, Kendrick 
  APCS1 - pd8
  2017-11-08
*/

public class Character{
    protected static String name;// initializes String name 
    protected static int hp;// initializes an int hp representing health
    protected static int str;// initializes an int str representing strength
    protected static int def; // initializes an int def representing defense
    protected static double atkRate; // initializes a double atkRating representing attack rating
    protected static int mp;// initializes an int mp respresenting Mana Points
    protected static int intelligence;// initializes an int intelligence which represents a characters knowledge in the field of magic 

    public static boolean isAlive(){
	if (hp <= 0){ // returns false if an object's health is less than or equal to 0, in case that an overkill happens
	    return false;
	}
	return true;// returns true if an object's health is not less than or equal to 0, meaning they are alive 
    }

    public static int getDefense(){
	return def; // returns object's defense
    }

    public static void lowerHP(int dmg){// lowers hp based on the value of dmg
	hp -= dmg;
    }
    
    public static int attack(Character chara){
	int dmg = (int)((str * atkRate) - chara.getDefense());//calculates damage

	if (dmg < 0){// set damage to 0 in the case that its less than 0 
	    dmg = 0;
	}
	lowerHP(dmg);//sets hp based on method above
	return dmg;//returns the amount of damage done
    }

    public static int magicAtk(Character chara){
	int dmg = 0;
	if (mp != 0){
	    dmg = (int)(intelligence - chara.getDefense());
	    if (dmg < 0){// set damage to 0 in the case that its less than 0 
	    dmg = 0;
	    mp -= 1;
	    }
	}
	lowerHP(dmg);
	return dmg;
    }
}