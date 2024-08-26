import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float metro;
		float milimetro;
		System.out.println("Digite um valor em metros:");
		metro = entrada.nextFloat();
		milimetro = metro * 1000;
		System.out.println("O valor de "+metro+" em milímetros é "+ milimetro);
		entrada.close();
	}

}
