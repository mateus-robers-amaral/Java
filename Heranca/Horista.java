package Heranca;

import java.util.Scanner;

public class Horista extends Empregado {
	private float valorHora;
	private float horasTrabalhadas;
	Horista() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor hora:");
		valorHora = scanner.nextFloat();
		System.out.println("Horas trabalhadas:");
		horasTrabalhadas = scanner.nextFloat();

        scanner.close();
	}
	public float Salario() {
		return valorHora * horasTrabalhadas;
	}
}
