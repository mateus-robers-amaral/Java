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
}
