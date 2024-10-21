import java.util.Random;

public class exercicio12 {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[10][10];
        int menor = 100000;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz [i][j] = random.nextInt(50) + 1;
                if (matriz [i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz 10x10 preenchida:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Menor número da matriz: " + menor);
    }
}
