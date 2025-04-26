package ex3;

import java.rmi.Naming;

public class ClientCalc {
    public static void main(String[] args) {
        try {
            Calculatrice calc = (Calculatrice) Naming.lookup("rmi://localhost/calc");

            System.out.println("5 + 3 = " + calc.add(5, 3));
            System.out.println("10 - 4 = " + calc.sub(10, 4));
            System.out.println("6 * 7 = " + calc.mul(6, 7));
            System.out.println("20 / 5 = " + calc.div(20, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
