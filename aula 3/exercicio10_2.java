import java.util.Scanner;
public class exercicio10_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x;
		int soma;
		int leitor;
		
		do {
			soma = 0;
			System.out.println("Digite o primeiro valor:");
			int val1 = entrada.nextInt();
			System.out.println("Digite o segundo valor:");
			int val2 = entrada.nextInt();
		
			if (val1 > val2) {
				x = val1;
				val1 = val2;
				val2 = x;
			}
			
			for (int i = val1; i <= val2; i++) {
				soma += i;
			}
			System.out.println(soma);
			System.out.println("Deseja continuar: [1] Sim, [2] Não");
			leitor = entrada.nextInt();
		
		} while (leitor == 1);
		
	}
	
}