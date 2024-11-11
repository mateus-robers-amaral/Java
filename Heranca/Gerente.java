package Heranca;

import java.util.Scanner;

public class Gerente extends Empregado {
    private float salarioMensal;

    Gerente() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salário mensal:");
        salarioMensal = scanner.nextFloat();

        scanner.close();
    }

    public float Salario() {
        return salarioMensal;
    }
}
