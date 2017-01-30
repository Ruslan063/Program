import java.util.Vector;

// Abstraction of a recipe.
// Tells the dispensers to dispense ingredients in sequence.
class Recipe
{
    private Vector ingredients = new Vector();

    Recipe(Ingredient i1, Ingredient i2, Ingredient i3, Ingredient i4, Ingredient i5)
    {
        addIngredient(i1);
        addIngredient(i2);
        addIngredient(i3);
        addIngredient(i4);
        addIngredient(i5);
    }

    private void addIngredient(Ingredient ingr)
    {
        if(ingr != null) ingredients.addElement(ingr);
    }

    public void makeDrink(DispenserRegister dispenserReg)
    {
        int i = 0;
        while (i<ingredients.size())
        {
            Ingredient nextIngr = (Ingredient) ingredients.elementAt(i);
            dispenserReg.getDispenserOf(nextIngr).dispense();
            i = i + 1;
        }
    }
}
