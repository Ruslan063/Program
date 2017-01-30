// knows its ingredient, knows how to dispense a shot of the ingredient
class Dispenser
{
    private Ingredient ingredient;
    private int shotsLeft;

    // constructor function called when creating a new dispenser:
    Dispenser(Ingredient ingr, int initialamount)
    {
	ingredient = ingr;
	shotsLeft = initialamount;
    }

    public boolean dispense()
    {
        // dispense one portion of the ingredient
	if (shotsLeft == 0)
	{
	    Output.print("\tDispenser: out of " + ingredient.name() + "\n");
	    return false;
        }
        else
        {
	    Output.print("\tDispensing " + ingredient.name() + "\n");
	    shotsLeft = shotsLeft - 1;
	    return true;
        }
    }

    // returns the ingredient contained in this dispenser
    public boolean contains(Ingredient i)
    {
        return i.equals(ingredient);
    }
}

