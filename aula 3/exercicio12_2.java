import java.util.Scanner;
public class exercicio12_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de n:");
		int num = entrada.nextInt();
		
		for (int i = num; i >= 1; i--) {
			int fatorial = num * i;
			System.out.println(fatorial);
		}
		
	}

}
