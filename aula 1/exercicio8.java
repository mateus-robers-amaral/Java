import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double quilometragem;
		int dias;
		double preco;
		System.out.println("Digite a quantidade de quilômetros rodados:");
		quilometragem = entrada.nextDouble();
		System.out.println("Digite a quantidade de dias com o carro:");
		dias = entrada.nextInt();
		
		preco = (dias * 60) + (quilometragem * 0.15);
		System.out.println("O preço total foi de " +preco);
		entrada.close();
	
	}

}
