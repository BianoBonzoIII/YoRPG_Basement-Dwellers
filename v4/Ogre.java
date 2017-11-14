public class Ogre extends Monster{
    public Ogre (String name){//creates an Ogre and sets its strength to 50
	super(name);
	str = 50;
    }
    public static String about(){
	return "The ogre is an offense-oriented monster. Be careful not to let your guard down.";
    }