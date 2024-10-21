import java.util.Arrays;
import java.util.Random;
public class exercicio7 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] lista = new int[10];

        System.out.println("Lista:");
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(50) + 1;
            lista[i] = num;
            System.out.println(lista[i]);
        }

        Arrays.sort(lista);
        System.out.println("\nLista em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.println(lista[i]);
        }

        System.out.println("\nLista em ordem decrescente:");
        for (int i = 0; i < 10 / 2; i++) {
            int temp = lista[i];
            lista[i] = lista[10 - i - 1];
            lista[10 - i - 1] = temp;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(lista[i]);
        }
    }
}
