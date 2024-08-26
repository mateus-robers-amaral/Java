import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dias;
		int horas;
		int minutos;
		int segundos;
		int total;
		System.out.println("Digite um valor de dias:");
		dias = entrada.nextInt();
		System.out.println("Digite um valor de horas:");
		horas = entrada.nextInt();
		System.out.println("Digite um valor de minutos:");
		minutos = entrada.nextInt();
		System.out.println("Digite um valor de segundos:");
		segundos = entrada.nextInt();
		total = ((dias * 86400) + (horas * 3600) + (minutos * 60) + segundos);
		System.out.println("O número total de segundo é " + total);
		entrada.close();
	}

}
