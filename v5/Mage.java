public class Mage extends Protagonist{
    public Mage (String name){// creates a Mage and sets his or her def to 80, mp to 10, and intelligence to 30.
	super(name);
	def = 80;
	mp = 10;
	intelligence = 30;
    }
    
    public void normalize(){// debuffs all stats that were buffed in specialize() back to their original values
	atkRate = 0.4;
	str = 100;
	def = 80;
	}

    public void specialize(){//buffs attack at cost of defense
	atkRate += .8;
	str += 8;
	def -= 10;
    }

    public String about(){
	return "The mage is highly intelligent and mostly a defensive character.Mages tend to sit on the backline to aid their swordsmen and archers.";
    }
}