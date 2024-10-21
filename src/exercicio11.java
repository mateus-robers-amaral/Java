import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        System.out.println("Digite 6 números para preencher a matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o número para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz 2x3 preenchida:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        entrada.close();
    }
}
