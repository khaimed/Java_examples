package Interface;

public class Produit implements Stock {
    private int stock;

    @Override
    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public double productPrice(int id) {
        return 300.00;
    }

    @Override
    public void stockInfo() {
        System.out.println("le stock contient 600 produits");
    }

    public void storeName(){
        System.out.println("Store Name is Mahal");
    }
}
