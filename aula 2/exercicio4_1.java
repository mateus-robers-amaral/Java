import java.util.Scanner;
public class exercicio4_1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float lado1;
		float lado2;
		float lado3;
		
		System.out.println("Digite o valor do lado 1 do triângulo:");
		lado1 = entrada.nextFloat();
		
		System.out.println("Digite o valor do lado 2 do triângulo:");
		lado2 = entrada.nextFloat();
		
		System.out.println("Digite o valor do lado 3 do triângulo:");
		lado3 = entrada.nextFloat();
		
		
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
		
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("O triângulo é equilátero!");	
			} 
			
			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){ 
					System.out.println("O triângulo é isóceles!");	
				} 
			
			else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){ 
					System.out.println("O triângulo é escaleno!");
				}
				
		} else {
			System.out.println("Os lados digitados não forma um triângulo!");
		}
		}
	}
