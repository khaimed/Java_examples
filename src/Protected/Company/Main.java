package Protected.Main.Company;

import Protected.Main.Bank.Bank;
import Protected.Main.Bank.CIH;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("Ahmed","Sadir","ahmed@sadir.com","060000000");
//        Protected.Main.Bank b2 = new Protected.Main.Bank("Youness","Rafia","youness@rafia.com","060200000");

//        System.out.println(b1.getInfo());
//        b1.setPassword("ahmed123");
//        System.out.println(b2.getInfo());
//        b2.setPassword("youness123");
//
//        System.out.println(b1.getPassword());
//        System.out.println(b2.getPassword());

//        b1.setMontant(4000.0);
//
//        b1.addMontant(200,0.2f);
//        System.out.println(b1.getMontant());
//        b1.retrait(100);
//        b1.retrait(400);
//        b1.retrait(5000);
//        System.out.println(b1.getMontant());
//
//        Protected.Main.Bank.nbrClient();
        CIH cih1 = new CIH("ahmed","asura","ahmed@asura.com","060000000");
        cih1.getInfoCIH();
        cih1.setMontant(3000.00);
        System.out.println(cih1.getMontant());
    }
}
