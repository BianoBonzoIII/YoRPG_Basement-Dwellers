public class Archer extends Protagonist{
    public Archer(String name){// creates an Archer and sets his or her strength to 175
	super(name);
	str = 175;
    }
    
    public void normalize(){// debuffs all stats that were buffed in specialize() back to their original values
	atkRate = 0.4;
	str = 175;
	def = 40;
    }
    public void specialize(){//buffs attack at cost of defense
	atkRate += .8;
	str += 8;
	def -= 10;
    }
    public String about(){
	return "This young archer is very strong. Strength at the cost of speed.";
    }
}