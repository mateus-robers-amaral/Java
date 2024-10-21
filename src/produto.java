import java.util.HashMap;
import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        HashMap<String, String> produtos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de produtos a ser inserida:\n--> ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + " : ");
            String chave = scanner.nextLine();

            System.out.println("Digite o preço de " + chave + " : ");
            String valor = scanner.nextLine();

            produtos.put(chave, valor);

        }

        System.out.println("\nDicionário completo: " + produtos);

        System.out.println("\nDigite uma chave para procurar no dicionário: ");
        String chaveBusca = scanner.nextLine();

        if (produtos.containsKey(chaveBusca)) {
            System.out.println("Valor associado à chave " + chaveBusca + " : " + produtos.get(chaveBusca));
        }
        else {
            System.out.println("A chave " + chaveBusca + " não foi encontrada.");
        }

        scanner.close();
    }
}
