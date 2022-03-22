package banco;

import modelos.Conta;

public class Banco {
    public static void main(String[] args) {
        Conta a = new Conta("Conta 1");
        a.Depositar(20);
        a.Sacar(15);
        System.out.println(a.toString());
    }
}
