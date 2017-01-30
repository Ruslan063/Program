// ingredient is just a string with the ingredient name

class Ingredient
{
    private String myName;

    // constructor function called when object is created, f.ex.,
    // Ingredient i = new Ingredient("sugar"):
    Ingredient(String name)
    {
        myName = name;
    }

    public String name()
    {
        return myName;
    }

}
