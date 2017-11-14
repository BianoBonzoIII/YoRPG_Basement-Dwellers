public class Dragon extends Monster{
    public Ogre (String name){//creates a Dragon and sets its hp to 1000, strength to 100, and defense to 100
	super(name);
	hp = 1000;
	str = 100;
	def = 100;
    }
    public static String about(){
	return "The dragon is a truly dangerous foe. Pray that you never encounter this beast.";
    }