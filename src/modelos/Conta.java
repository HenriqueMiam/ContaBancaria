package modelos;

public class Conta {

    double saldo;
    String conta;

    public Conta(String conta){
        saldo = 0;
        this.conta = conta;
    }

    public void Depositar (float deposito){
        saldo += deposito;
    }

    public void Sacar (float sacar){
        if(sacar>saldo){
            System.out.println("Erro");
        }
        else {
            saldo -= sacar;
        }
    }

    public String toString (){
        return "Saldo:" + saldo ;
    }

}
