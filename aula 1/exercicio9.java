import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int fahrenheit;
		int celsius;
		System.out.println("Digite a temperatura em Fahrenheit:");
		fahrenheit = entrada.nextInt();
		celsius = ((fahrenheit - 32)/9)*5;
		System.out.println("O valor digitado em Celsius é " + celsius + "°C");
		entrada.close();

	}
	
}
