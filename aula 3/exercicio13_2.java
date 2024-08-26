import java.util.Scanner;
public class exercicio13_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = entrada.nextInt();
		
		if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
			System.out.println("O número"+num+" é primo!");
		}
		else {
			System.out.println("O número "+num+" não é primo!");
		}
	}

}
