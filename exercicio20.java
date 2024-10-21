import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma frase:\n--> ");
            String palavra = scanner.nextLine();
            if (!palavra.equals(".")) {
                System.out.print("\nDigite uma letra a ser removida:\n--> ");
                char letra = scanner.nextLine().charAt(0);

                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) != letra)
                        System.out.print(palavra.charAt(i));
                }
                System.out.println();
            } else if (palavra.equals(".")) {
                break;
            }
        }
        scanner.close();
    }
}