/*
  Team Basement Dwellers -- Brian, George, Kendrick 
  APCS1 - pd8
  2017-11-08
*/

public abstract class Protagonist extends Character{
	public static String name; 
	public static int hp; 
	public static int str;
	public static int def;
	public static double atkRate;
	
    public Protagonist(String n) {
	name = n; // sets name to n
	hp = 125;// sets health to 125
	str = 100;// sets strength to 100
	def = 40;// sets defense to 40
	atkRate = 0.4;// sets atkRate to 0.4
    }

    public static String getName(){
	return name; // returns object's name
    }

    public abstract void specialize();
 
    public abstract void normalize();

    public abstract String about();
}