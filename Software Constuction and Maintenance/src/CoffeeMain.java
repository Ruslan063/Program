class CoffeeMain
{
    /**
     * The main entry point for the application.
     *
     * @param args Array of parameters passed to the application
     * via the command line.
     */
    public static void main (String[] args)
    {
        CoffeeMachine cm = new CoffeeMachine();
        while (cm.doOneAction())
        {
            //just loop
        }
    }
}
