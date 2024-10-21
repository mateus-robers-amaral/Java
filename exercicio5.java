import java.util.Random;

public class exercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] lista = new int[10];

        System.out.println("Vetor na ordem direta:");
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(50) + 1;
            lista[i] = num;
            System.out.println(lista[i]);
        }

        int n = lista.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = lista[i];
            lista[i] = lista[n - i - 1];
            lista[n - i - 1] = temp;
        }
        System.out.println("Vetor espelhado:");
        for (int i = 0; i < n; i++) {
            System.out.println(lista[i]);
        }
    }
}