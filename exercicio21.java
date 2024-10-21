import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Digite o seu nome completo:\n--> ");
            String nome = scanner.nextLine().toUpperCase();

            if (nome.charAt(0) == '.') {
                break;
            }

            System.out.print(nome.charAt(0) + ".");

            for (int i = 0; i < nome.length(); i++) {
                if (nome.charAt(i) == ' ') {

                    System.out.print(nome.charAt(i + 1) + ".");
                }
            }
            System.out.println("");
        }

        scanner.close();
    }
}
