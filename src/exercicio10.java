import java.util.Random;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int[] lista = new int[10];
        boolean[] gerado = new boolean[50];

        System.out.println("Vetor gerado:");
        for (int i = 0; i < 10; i++) {
            int num;
            do {
                num = random.nextInt(50) + 1;
            } while (gerado[num - 1]);
            lista[i] = num;
            gerado[num - 1] = true;
            System.out.print(lista[i] + " ");
        }

        System.out.println("\n\nDigite um número para verificar se está no vetor:");
        int numeroUsuario = entrada.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numeroUsuario) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número " + numeroUsuario + " encontrado no vetor.");
        } else {
            System.out.println("Número " + numeroUsuario + " não encontrado no vetor.");
        }

        entrada.close();
    }
}
