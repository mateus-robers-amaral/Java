import java.util.Scanner;
public class classe_scanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float preco;
		double taxa;
		double precoFinal;
		System.out.println("Digite o preço do produto: ");
		preco = entrada.nextFloat();
		System.out.println("Digite a taca aplicada ao produto: ");
		taxa = entrada.nextDouble()/100;
		precoFinal = (preco * taxa);
		System.out.println("O preço final do produto é "+precoFinal);
	}

}
