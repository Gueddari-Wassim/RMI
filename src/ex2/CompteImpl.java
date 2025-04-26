package ex2;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CompteImpl extends UnicastRemoteObject implements CompteInterface {
    private float solde;
    private float decouvert;

    public CompteImpl() throws RemoteException {
        solde = 0;
        decouvert = 0;
    }

    public float getSolde() {
        return solde;
    }

    public void verser(float mt) {
        solde += mt;
    }

    public void retirer(float mt) {
        if (solde - mt >= -decouvert) {
            solde -= mt;
        } else {
            System.out.println("Fonds insuffisants !");
        }
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float d) {
        decouvert = d;
    }
}
