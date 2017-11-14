public class Archer extends Protagonist{
    public Archer(String name){// creates an Archer and sets his or her strength to 175
	super(name);
	str = 175;
    }
    public static String about(){
	return "This young archer is very strong. Strength at the cost of speed.";
    }
}