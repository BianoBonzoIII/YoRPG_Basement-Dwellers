public class Swordsman extends Protagonist{
    public Swordsman(String name){//creates a Swordsman and sets his or her atkRate to 0.8
	super(name);
	atkRate= 0.8;
    }
    public static String about(){
	return "A brave swordsman who is an exile to his army. His swordsmanship skills are very fine and nimble.";
    }
   
}