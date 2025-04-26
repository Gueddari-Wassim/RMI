package ex1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class RemoteObject extends UnicastRemoteObject implements IRemote {

    public RemoteObject() throws RemoteException {
        super();
    }

    @Override
    public void echo() throws RemoteException {
        System.out.println("TP RMI");
    }

    public static void main(String[] args) {
        try {
            IRemote obj = new RemoteObject();
            Naming.rebind("rmi://localhost:1099/remoteEcho", obj);
            System.out.println("Serveur prêt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

