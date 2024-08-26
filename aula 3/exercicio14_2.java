import java.util.Scanner;
public class exercicio14_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = entrada.nextInt();
		int i = 1;
		int soma_impares = 0;
		
		while(soma_impares < num) {
			soma_impares += i;
			i+= 2;
		}
		if (num == soma_impares) {
			System.out.println("O número digitado é um quadrado perfeito!");
		}
		else {
			System.out.println("O número digitado não é um quadrado perfeito!");
		}
	}

}
