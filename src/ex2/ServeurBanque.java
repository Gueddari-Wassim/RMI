package ex2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurBanque {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CompteImpl c = new CompteImpl();
            Naming.rebind("rmi://localhost/banque", c);
            System.out.println("Serveur prêt !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
