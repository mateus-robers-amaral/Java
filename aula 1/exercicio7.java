import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float combustivel;
		float desempenho;
		float distancia;
		
		System.out.println("Digite o preço do combustível:");
		combustivel = entrada.nextFloat();
		System.out.println("Digite o desempenho do carro (km/l):");
		desempenho = entrada.nextFloat();
		System.out.println("Digite a distância entre as duas cidades:");
		distancia = entrada.nextFloat();
		
		float total;
		float precoTotal;
		total = (distancia/desempenho);
		precoTotal = (total * combustivel);
		System.out.println("A quantidade de litros a ser gasta será de " + total);
		System.out.println("A quantidade de dinheiro a ser gasta será de R$" + precoTotal);
		entrada.close();
		
	}

}
