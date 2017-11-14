/*
  Team Basement Dwellers -- Brian, George, Kendrick 
  APCS1 - pd8
  2017-11-08
*/

public abstract class Protagonist extends Character{

    public Protagonist(String n){
	name = n; // sets name to n
	hp = 125;// sets health to 125
	str = 100;// sets strength to 100
	def = 40;// sets defense to 40
	atkRate = 0.4;// sets atkRate to 0.4
    }

    public static String getName(){
	return name;// returns object's name
    }

    public abstract static void specialize(){//buffs attack at cost of defense
	atkRate += .8;
	str += 8;
	def -= 10;
    }
 
    public abstract void normalize(){// debuffs all stats that were buffed in specialize() back to their original values
	atkRate = 0.4;
	str = 100;
	def = 40;
    } 
}