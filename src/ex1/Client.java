package ex1;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            IRemote stub = (IRemote) Naming.lookup("rmi://localhost:1099/remoteEcho");
            stub.echo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

