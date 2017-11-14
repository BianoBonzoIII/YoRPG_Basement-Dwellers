public class Dragon extends Monster{
    public Ogre (String name){//creates a Dragon and sets its hp to 300
	super(name);
	hp = 300;
    }
    public static String about(){
	return "The dragon is a truly dangerous foe. Pray that you never encounter this beast.";
    }