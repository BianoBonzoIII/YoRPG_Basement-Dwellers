public class Slime extends Monster{
    public Ogre (String name){//creates a Slime and sets its hp to 100, strength to 10, and defense to 25
	super(name);
	hp = 100;
	str = 10;
	def = 25;
    }
    public static String about(){
	return "The slime is a weak pile of goo. Even a child stands a chance against this foe.";
    }