/*
  Team Basement Dwellers -- Brian, George, Kendrick 
  Brian Lin 
  APCS1 - pd8
  2017-11-08
*/

public class Character{
    private static String name;// initializes String name 
    private static int hp;// initializes an int hp representing health
    private static int str;// initializes an int str representing strength
    private static int def; // initializes an int def representing defense
    private static double atkRate; // initializes a double atkRating representing attack rating

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
	lowerHP(dmg);//sets hp based on method above
	return dmg;//returns the amount of damage done
    }
}
