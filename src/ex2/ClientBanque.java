package ex2;

import java.rmi.Naming;

public class ClientBanque {
    public static void main(String[] args) {
        try {
            CompteInterface c = (CompteInterface) Naming.lookup("rmi://localhost/banque");

            c.verser(500);
            System.out.println("Solde après versement : " + c.getSolde());

            c.retirer(100);
            System.out.println("Solde après retrait : " + c.getSolde());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
