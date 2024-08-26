import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float salario;
		float reajuste;
		float novoSalario;
		System.out.println("Digite o salário do funcionário:");
		salario = entrada.nextFloat();
		System.out.println("Digite o reajuste desejado para o salário do funcionário:");
		reajuste = entrada.nextFloat();
		novoSalario = salario + (salario * (reajuste/100));
		System.out.println("O novo salário do funcionário é " + novoSalario);
		entrada.close();
	
	
	}

}
