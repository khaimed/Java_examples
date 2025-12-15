package Protected.Main.Bank;

// class
public class Bank {
    // attribute
    public String fname;
    public String lname;
    public String email;
    public String phone;
    protected Double montant;
    protected String password;
    public static int nbClient = 0;

    // constructor
    public Bank(String fname, String lname, String email, String phone) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        nbClient++;
    }

    // Method
    public String getInfo(){
        return this.fname + " \n" + this.lname + " \n" + this.email + " \n" + this.phone;
    }
    //setter
    public void setPassword(String password) {
        this.password = password;
    }
    //getter
    public String getPassword() {
        return this.password;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void addMontant(int montant, float interet ){
        this.montant = this.montant + montant + montant * interet;
    }

    public void retrait(int value){
        if(value > this.montant){
            System.out.println("impossible");
        } else {
            this.montant = this.montant - value;
        }
    }

    public static void nbrClient(){
        System.out.println("nbr client " + nbClient);
    }
}
