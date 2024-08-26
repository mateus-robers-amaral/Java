// exercício: tirar a média de dois números
import java.util.Scanner;
public class teste1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro:");
		int numero1 = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int numero2 = scanner.nextInt();
		int media = (numero1 + numero2)/2;
		System.out.println("A soma dos dois números é: " + media);
		scanner.close();
	}
}
