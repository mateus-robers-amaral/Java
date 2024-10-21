import java.util.Random;

public class exercicio19 {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("\nMatriz 10x10 preenchida:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Diagonal secundária:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == 9) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
