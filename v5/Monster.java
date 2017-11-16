/*
  Team Basement Dwellers -- Brian, George, Kendrick  
  APCS1 - pd8
  2017-11-08
*/

public class Monster extends Character {

    public Monster() { // Initializes all attributes
	hp = 150;
	def = 20;
	atkRate = 1.0;
	str = 30;
	name = "Lava Ogre";
    }
    
    public static String getName() { // Returns value of name attribute
	return name;
    }
}
	