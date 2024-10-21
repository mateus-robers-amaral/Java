import java.util.Random;
import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        int coluna = 0;
        int[] colunaEscolhida = new int[10];
        int valor = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
                colunaEscolhida[i] += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("\nDigite uma coluna:");
        coluna = scanner.nextInt();

        System.out.println("\nDigite um valor:");
        valor = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            colunaEscolhida[i] = matriz[i][coluna];
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(colunaEscolhida[j] * valor + " ");

        }
        scanner.close();
    }
}