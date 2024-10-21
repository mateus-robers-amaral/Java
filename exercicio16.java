import java.util.Random;

public class exercicio16 {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[10][10];
        int soma;
        int[] somaColunas = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("\nMatriz 10x10 preenchida:");
        for (int i = 0; i < 10; i++) {
            soma = 0;
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
                soma += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("| Soma da coluna " + (j + 1) + ": " + somaColunas[j]);

        }
    }
}