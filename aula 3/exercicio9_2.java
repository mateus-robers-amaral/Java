import java.util.Scanner;
public class exercicio9_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o valor de n? ");
		int n = entrada.nextInt();
		
		int anterior = 0;
		int fibonacci = 1;
		int aux = 0;
		
		for (int i = 0; i <= n; i++) {
			System.out.println(anterior + fibonacci);
			aux = anterior;
			anterior = fibonacci;
			fibonacci = fibonacci + aux;			
		}
	
	}

}
