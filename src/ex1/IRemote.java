package ex1;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemote extends Remote {
    void echo() throws RemoteException;
}