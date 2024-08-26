import java.util.Scanner;
public class exercicio5_1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float ang1;
		float ang2;
		float ang3;
		
		System.out.println("Digite o valor do ângulo 1 do triângulo:");
		ang1 = entrada.nextFloat();
		
		System.out.println("Digite o valor do ângulo 2 do triângulo:");
		ang2 = entrada.nextFloat();
		
		System.out.println("Digite o valor do ângulo 3 do triângulo:");
		ang3 = entrada.nextFloat();
		
		
		if (ang1 + ang2 + ang3 == 180) {
		
			if (ang1 == 90 | ang2 == 90 || ang3 == 90) {
				System.out.println("O triângulo é retângulo!");	
			} 
			
			else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
				System.out.println("O triângulo é obtusângulo!");	
				
				} 
			
			else if (ang1 < 90 || ang2 < 90 || ang3 < 90){ 
					System.out.println("O triângulo é acutângulo!");
				}
				
		} else {
			System.out.println("Os lados digitados não forma um triângulo!");
			}
		}
	}
