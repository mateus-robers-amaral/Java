import java.util.Scanner;

public class Conta {
    private String nome;
    private int numero;
    private double saldo;

    public Conta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        this.numero = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        this.saldo = scanner.nextDouble();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean retirar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Retirada de " + valor + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de retirada inválido.");
            return false;
        }
    }

    public double consultaSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + conta.getNome());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo Inicial: " + conta.consultaSaldo());

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Retirar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor para depositar: ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            } else if (opcao == 2) {
                System.out.print("Digite o valor para retirar: ");
                double valor = scanner.nextDouble();
                boolean sucesso = conta.retirar(valor);
                if (!sucesso) {
                    System.out.println("Operação de retirada falhou.");
                }
            } else if (opcao == 3) {
                System.out.println("Saldo atual: " + conta.consultaSaldo());
            } else if (opcao == 4) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
