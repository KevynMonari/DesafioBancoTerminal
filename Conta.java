package ContaBancária;

public class Conta {
    private double saldo;
    private String numeroDaConta;
 
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(String nDaConta){
        this.numeroDaConta = nDaConta;
        this.saldo = 0;
    }

    public void sacar(double saldo) {
        if (this.saldo >= saldo) {
            this.saldo -= saldo;
        }else{
            System.out.println("\n\tValor inválido\n");
        }
    }

    public void depositar(double dep) {
        this.saldo += dep;
        System.out.println("\n\tValor depositado " + dep + "\n");
    }

    
}
