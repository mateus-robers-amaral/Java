import java.util.Scanner;
public class exercicio5_2 {
 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		int num = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
			if (num%2==0) {
				par += num;
			} 
			else {
				impar += num;
			}
		}
		System.out.println("A soma dos números pares é "+par);
		System.out.println("A soma dos números impares é "+impar);

	}

}
