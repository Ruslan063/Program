class CashBox
{
    // knows about money; gives change
    private int credit = 0;

    // user deposits money
    public void deposit(int amount)
    {
        Output.print("\tCashBox: Depositing " + amount);
        credit = credit + amount;
        Output.print("\tYou now have " + credit + " credits.\n");
    }

    // return the currently available credit (change) to the user
    public void returnCoins()
    {
        Output.print("\tCashBox: Returning " + credit + "\n");
        credit = 0;
    }

    // returns true if user has deposited "amount" or more money
    public boolean haveYou(int amount)
    {
        return (credit >= amount);
    }

    // take amount from the credit, return the rest.
    public void deduct(int amount)
    {
        credit = credit - amount;
        returnCoins();
    }
}
