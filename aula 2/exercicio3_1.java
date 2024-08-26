import java.util.Scanner;
public class exercicio3_1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura;
		double base;
		int op;
		
		System.out.println("Digite o valor da altura:");
		altura = entrada.nextInt();
		
		System.out.println("Digite o valor da base:");
		base = entrada.nextInt();
		
		System.out.println("Digite a operação a ser feita, sendo 1 para retângulo e 2 para triângulo:");
		op = entrada.nextInt();
		
		switch (op) { 
		case(1): {
			double area = base * altura;
			System.out.println("A área do retângulo é: " + area);
			break;
		}
		case(2): {
			double area = (base * altura)/2;
			System.out.println("A área do triângulo é: " + area);
			break;
		}
		}

	}


}
