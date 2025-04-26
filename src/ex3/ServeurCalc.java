package ex3;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurCalc extends UnicastRemoteObject implements Calculatrice {
    protected ServeurCalc() throws RemoteException {
        super();
    }

    public float add(float a, float b) {
        return a + b;
    }

    public float sub(float a, float b) {
        return a - b;
    }

    public float mul(float a, float b) {
        return a * b;
    }

    public float div(float a, float b) {
        return b != 0 ? a / b : 0;
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ServeurCalc calc = new ServeurCalc();
            Naming.rebind("rmi://localhost/calc", calc);
            System.out.println("Calculatrice prête !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
