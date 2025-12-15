package Interface;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit();
        p1.setStock(433);
        System.out.println(p1.productPrice(4));
        p1.stockInfo();
        p1.storeName();
        System.out.println(p1.getStock());
    }
}
