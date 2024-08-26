import java.util.Scanner;
public class exercicio4_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
	
			System.out.println("Digite a primeira nota: ");
			int nota1 = entrada.nextInt();
			System.out.println("Digite a segunda nota: ");
			int nota2 = entrada.nextInt();
			double media = (nota1 + nota2)/2;
			System.out.println("A sua média foi de: "+media);
		}
	}

}
