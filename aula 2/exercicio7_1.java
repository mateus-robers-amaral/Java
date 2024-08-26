import java.util.Scanner;
public class exercicio7_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Você deverá digitar 3 números inteiros diferentes.");

		System.out.println("Digite o primeiro número:");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número:");
		num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("1°:" + num1);
			System.out.println("2°:" + num2)
			System.out.println("3°:" + num3);
		}
		else if (num1 > num2 && num1 > num3 && num2 < num3) {
			System.out.println("1°:" + num1);
			System.out.println("2°:" + num3);
			System.out.println("3°:" + num2);
		}
		else if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("1°:" + num2);
			System.out.println("2°:" + num1);
			System.out.println("3°:" + num3);
		}
		else if (num2 > num1 && num2 > num3 && num1 < num3) {
			System.out.println("1°:" + num2);
			System.out.println("2°:" + num3);
			System.out.println("3°:" + num1);
		}
		else if (num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("1°:" + num3);
			System.out.println("2°:" + num1);
			System.out.println("3°:" + num2);
		}
		else if (num3 > num1 && num3 > num2 && num1 < num2) {
			System.out.println("1°:" + num3);
			System.out.println("2°:" + num2);
			System.out.println("3°:" + num1);
		}
	}
}
