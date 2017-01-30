import java.util.Vector;

// class ProductRegister:
// Abstraction of the thing that holds all the products.
// Knows what products are available.
class ProductRegister
{
    private Vector products = new Vector();

    public Product productFromIndex(int index)
    {
        return (Product) products.elementAt(index-1);
    }

    public void addProduct(Product p)
    {
        products.addElement(p);
    }
}
