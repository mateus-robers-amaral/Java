import java.util.Scanner;
public class exercicio15_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println("");
		}
	}

}