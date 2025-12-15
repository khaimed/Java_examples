package Generic;
interface Bank {
    public Double addToSolde(Double solde, int montant);
}
class BankMaghreb implements Bank{

    @Override
    public Double addToSolde(Double solde, int montant) {
        solde += montant;
        return solde;
    }
}

class BankMaghreb2 implements Bank{

    @Override
    public Double addToSolde(Double solde, int montant) {
        solde += (montant + 20);
        return solde;
    }

}

class CIH<T extends Bank> {
    public String nom;
    public Double solde;
    T bankOffert;

    public CIH (String nom, T bankOffert, Double solde) {
        this.nom = nom;
        this.bankOffert = bankOffert;
        this.solde = solde;
    }

    public Double addToSolde(int montant) {
        this.solde = bankOffert.addToSolde(this.solde, montant);
        return this.solde;
    }
}

class Main {
    public static void main(String[] args) {
        BankMaghreb b1 = new BankMaghreb();
        BankMaghreb2 b2 = new BankMaghreb2();

        CIH<BankMaghreb> ad1 = new CIH("Ahmed", b1, 1000.0);
        CIH<BankMaghreb2> ad2 = new CIH("Asmaa", b2, 900.0);


        System.out.println(ad1.addToSolde(100));
        System.out.println(ad2.addToSolde(100));
    }
}