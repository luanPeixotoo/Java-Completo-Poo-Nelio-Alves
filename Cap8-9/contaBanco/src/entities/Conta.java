package entities;

public class Conta {

    private int nConta;
    private String nomeTitular;
    private double saldo;

    public Conta() {
    }

    public Conta(int nConta, String nomeTitular) {
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int nConta, String nomeTitular, double saldo) {
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getnConta() {
        return nConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo(double saldo) {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void sacar(double saldo) {
        this.saldo -= saldo + 5.0;
    }

    @Override
    public String toString() {
        return
                "Conta " + nConta +
                        " | Titular:  " + nomeTitular +
                        " | Saldo: $" +
                        String.format("%.2f", saldo);
    }
}


