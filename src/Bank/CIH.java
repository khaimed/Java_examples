package Bank;

public class CIH  extends Bank {

    public CIH(String fname, String lname, String email, String phone) {
        super(fname, lname, email, phone);
    }

    public void getInfoCIH()  {
        String info = super.getInfo();
        System.out.println(info + "pour CIH");
    }

    public void addMontant(int m, float interet, int p) {
        super.addMontant(m, interet);
        System.out.println("avant " + super.montant);
        super.montant += p;
        System.out.println("votre nouveau sold est: " + super.montant);
    }

}
