package ContaBancária;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        System.out.println("Digite o número da conta: ");
        String numConta = sc.next();

        Conta objConta = new Conta(numConta);
        
        do {

            System.out.println("1 - Sacar\n" + "2 - Depositar\n" +
                "3 - Verificar saldo\n" + "4 - Sair");

                System.out.println("Digite um opção: ");
                opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    if (objConta.getSaldo() > 0) {
                        System.out.println("\n\tDigite o valor que deseja sacar: ");
                        int saldo = sc.nextInt();
                        objConta.sacar(saldo);
                    }else{
                        System.out.println("\n\tO saldo disponível impossibilita efetuar um saque!\n");
                    }
                    break;
                case 2:
                    System.out.println("\n\tDigite o valor que deseja depositar: ");
                    int dep = sc.nextInt();
                    objConta.depositar(dep);
                    break;
                case 3:
                    System.out.println("\n\tNúmero da Conta: " + objConta.getNumeroDaConta());
                    System.out.println("\tSaldo disponível: " + objConta.getSaldo() + "\n");
                    break;
            }
        } while (opcao != 4);
        sc.close();
    }
}
