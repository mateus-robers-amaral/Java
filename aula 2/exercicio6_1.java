import java.util.Scanner;
public class exercicio6_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite o ano:");
		ano = entrada.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("O ano digitado é bissexto!");
		}
		else {
			System.out.println("O ano digitado não é bissexto!");
		}
	}
}
