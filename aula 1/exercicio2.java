import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		float media;
		System.out.println("Digite um número inteiro:");
		numero1 = entrada.nextInt();
		System.out.println("Digite um segundo número inteiro:");
		numero2 = entrada.nextInt();
		System.out.println("Digite um terceiro número inteiro:");
		numero3 = entrada.nextInt();
		media = (numero1 + numero2 + numero3)/3;
		System.out.print("A média desses números é " + media);
		entrada.close();
	
	}

}
