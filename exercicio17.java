import java.util.Random;
import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        int linha = 0;
        int[] linhaEscolhida = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
                linhaEscolhida[i] += matriz[i][j];
            }
        }

        System.out.println("\nDigite uma linha:");
        linha = scanner.nextInt();

        for (int j = 0; j < 10; j++) {
            linhaEscolhida[j] = matriz[linha][j];
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(linhaEscolhida[j] + " ");

        }
        scanner.close();
    }
}