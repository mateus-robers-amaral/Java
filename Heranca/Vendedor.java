package Heranca;

import java.util.Scanner;
public class Vendedor {
    private float salarioBase;
    private float vendasMes;
    private float comissao;

    Vendedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salário base:");
        salarioBase = scanner.nextFloat();

        System.out.println("Vendas do mês:");
        vendasMes = scanner.nextFloat();

        System.out.println("Comissão:");
        comissao = scanner.nextFloat();

        scanner.close();
    }

    public float Salario() {
        return salarioBase + vendasMes * comissao;
    }
}
