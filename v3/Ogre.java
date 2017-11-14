public class Ogre extends Monster{
    public Ogre (String name){//creates an Ogre and sets its hp to 500 and defense to 75
	super(name);
	hp = 500;
	def = 75;
    }
    public static String about(){
	return "The ogre is a bulky monster. It'll take several hits to take this behemoth down.";
    }