import java.util.Scanner;
public class exercicio1_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int centena;
		int dezena;
		int unidade;
		
		System.out.println("Digite um número de 3 algarismos, ou seja, maior que 99 e menor que 1000:");
		num = entrada.nextInt();
		
		centena = num / 100;
		dezena = (num % 100) / 10;
		unidade = num % 10;
		
		System.out.println("Centena: " + centena);
		System.out.println("Dezena: " + dezena);
		System.out.println("Unidade: " + unidade);
		
		if (num >= 1000 || num <= 100) {
			System.out.println("O número deve conter 3 algarismos!");
		} else {
			
		if (centena < dezena && dezena < unidade) {
			System.out.println("O número está em ordem ascendente!");
		} else {
			System.out.println("O número não está em ordem ascendente!");
		}
	} 	entrada.close();
}}