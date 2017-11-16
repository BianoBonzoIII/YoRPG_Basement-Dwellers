public class Swordsman extends Protagonist{
    public Swordsman(String n){//creates a Swordsman and sets his or her atkRate to 0.8, mp to 5, and intelligence to 15. 
	super(name);
	atkRate= 0.8;
	mp = 5;
	intelligence = 15;
    }

    public void normalize(){// debuffs all stats that were buffed in specialize() back to their original values
	atkRate = 0.8;
	str = 100;
	def = 40;
    }

    public void specialize(){//buffs attack at cost of defense
	atkRate += .8;
	str += 8;
	def -= 10;
    }
	

    public String about(){
	return "A brave swordsman who is an exile to his army. His swordsmanship skills are very fine and nimble.";
    }
   
}