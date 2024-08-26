import java.util.Scanner;
public class exercicio2_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int placa;
		int final_da_placa;
		
		System.out.println("Digite os quatro últimos números da sua placa:");
		placa = entrada.nextInt();
		
		final_da_placa = placa % 10;
		
		switch (final_da_placa) {
		case (1):System.out.println("O seu dia de rodízio é Segunda-feira!");break;
		case (2):System.out.println("O seu dia de rodízio é Segunda-feira!");break;
		case (3):System.out.println("O seu dia de rodízio é Terça-feira!");break;
		case (4):System.out.println("O seu dia de rodízio é Terça-feira!");break;
		case (5):System.out.println("O seu dia de rodízio é Quarta-feira!");break;
		case (6):System.out.println("O seu dia de rodízio é Quarta-feira!");break;
		case (7):System.out.println("O seu dia de rodízio é Quinta-feira!");break;
		case (8):System.out.println("O seu dia de rodízio é Quinta-feira!");break;
		case (9):System.out.println("O seu dia de rodízio é Sexta-feira!");break;
		case (0):System.out.println("O seu dia de rodízio é Sexta-feira!");break;
		}
		entrada.close();
	}

}
