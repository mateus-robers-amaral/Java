import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A;
		int B;
		int C;
		System.out.println("Digite um número inteiro para ser guardado em A:");
		A = entrada.nextInt();
		System.out.println("Digite um número inteiro para ser guardado em B:");
		B = entrada.nextInt();
		C = A;
		A = B;
		B = C;
		System.out.println("O número da variável A é " + A + ", e o número da variável B é " + B);
		entrada.close();
	}

}
