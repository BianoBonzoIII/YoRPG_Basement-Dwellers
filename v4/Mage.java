public class Mage extends Protagonist{
    public Mage (String name){// creates a Mage and sets his or her def to 80
	super(name);
	def = 80;
    }
    public static String about(){
	return "The mage is highly intelligent and mostly a defensive character.Mages tend to sit on the backline to aid their swordsmen and archers.";
    }
}