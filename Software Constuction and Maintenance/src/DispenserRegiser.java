import java.util.Vector;

// contains all the dispensers, knows which dispenser contains a given ingredient
class DispenserRegister
{
    private Vector dispensers = new Vector();

    // add dispenser to the vector
    public void addDispenser(Dispenser dispenser)
    {
        dispensers.addElement(dispenser);
    }

    // find the dispenser for a given ingredient
    public Dispenser getDispenserOf(Ingredient ingr)
    {
        int index = 0;
	while (index < dispensers.size())
        {
	    Dispenser d = (Dispenser) dispensers.elementAt(index);
	    if (d.contains(ingr)) return d;
	    index = index + 1;
        }
        return null;
    }
}
