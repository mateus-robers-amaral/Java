import java.util.Random;
import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[7][4];
        int coluna = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("Digite uma coluna da matriz:");
        coluna = entrada.nextInt();
        if (0 > coluna || coluna > 4) {
            System.out.println("Coluna inexistente na matriz.");
        } else {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j == coluna) {
                        System.out.print(matriz[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        entrada.close();
    }
}