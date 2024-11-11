package Bebidas;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Refrigerante> refrigerantes = new ArrayList<>();
        ArrayList<Suco> sucos = new ArrayList<>();
        ArrayList<Vinho> vinhos = new ArrayList<>();

        char opcao = '0';

        while (opcao != '3') {
            System.out.println("\nBebidas");
            System.out.println("1. Cadastrar");
            System.out.println("  A. Refrigerante");
            System.out.println("  B. Suco");
            System.out.println("  C. Vinho");
            System.out.println("2. Imprimir");
            System.out.println("  A. Refrigerante");
            System.out.println("  B. Suco");
            System.out.println("  C. Vinho");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().charAt(0);
            scanner.nextLine();

            if (opcao == '1') {
                System.out.print("Digite o tipo (A - Refrigerante, B - Suco, C - Vinho): ");
                char tipoCadastro = scanner.next().charAt(0);
                scanner.nextLine();

                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();

                if (tipoCadastro == 'A' || tipoCadastro == 'a') {
                    System.out.print("Retornável (true/false): ");
                    boolean retornavel = scanner.nextBoolean();
                    refrigerantes.add(new Refrigerante(nome, preco, retornavel));
                } else if (tipoCadastro == 'B' || tipoCadastro == 'b') {
                    System.out.print("Sabor: ");
                    scanner.nextLine();
                    String sabor = scanner.nextLine();
                    sucos.add(new Suco(nome, preco, sabor));
                } else if (tipoCadastro == 'C' || tipoCadastro == 'c') {
                    System.out.print("Safra: ");
                    int safra = scanner.nextInt();
                    vinhos.add(new Vinho(nome, preco, safra));
                } else {
                    System.out.println("Opção inválida!");
                }
            } else if (opcao == '2') {
                System.out.print("Digite o tipo para imprimir (A - Refrigerante, B - Suco, C - Vinho): ");
                char tipoImpressao = scanner.next().charAt(0);

                if (tipoImpressao == 'A' || tipoImpressao == 'a') {
                    for (Refrigerante refri : refrigerantes) {
                        refri.mostraBebida();
                    }
                } else if (tipoImpressao == 'B' || tipoImpressao == 'b') {
                    for (Suco suco : sucos) {
                        suco.mostraBebida();
                    }
                } else if (tipoImpressao == 'C' || tipoImpressao == 'c') {
                    for (Vinho vinho : vinhos) {
                        vinho.mostraBebida();
                    }
                } else {
                    System.out.println("Opção inválida!");
                }
            } else if (opcao == '3') {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
