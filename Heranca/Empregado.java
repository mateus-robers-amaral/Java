package Heranca;

import java.util.Scanner;

public class Empregado {
    Scanner scanner = new Scanner(System.in);
    private int numero;
    private String nome;

    public Empregado() {
        System.out.println("Digite o número: ");
        numero = scanner.nextInt();
        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

}
