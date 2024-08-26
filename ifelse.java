import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		//if (expressão)
			//comando ou {bloco}
		//else // opcional
			//comando oui {bloco}// opcional
		Scanner entrada = new Scanner(System.in);
		int menu;
		System.out.println("Digite qual opção do menu desejas:");
		menu = entrada.nextInt();
		
		switch (menu) {
		case 1: System.out.println("Item do menu 1");break;
		case 2: System.out.println("Item do menu 2");break;
		case 3: System.out.println("Item do menu 3");break;
		case 4: System.out.println("Item do menu 4");break;
		case 5: System.out.println("Item do menu 5");break;
		}
		
	
	
	
	
	}
}
