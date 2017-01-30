class FrontPanel
{
    // instructs the correct product to make the drink
    // instructs CashBox to return change

    public void select(int choiceIndex, CashBox cashBox, ProductRegister productReg, DispenserRegister dispenserReg)
    {
        Product product;
        product = productReg.productFromIndex(choiceIndex);
        if (cashBox.haveYou(product.price()))
        {
            //1 = Black Coffee, 2=Coffee w/Cream, 3=Coffee w/Sugar, 4=Coffee w/Sugar & Cream
            product.makeDrink(dispenserReg); //make product using the dispensers
            cashBox.deduct(product.price()); //deduct price
        }
        else
        {
            Output.print("\tFrontPanel: Insufficient funds\n");
        }
    }
}
