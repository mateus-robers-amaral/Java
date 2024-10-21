import java.util.Random;

public class exercicio9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lista = new int[10];
        boolean[] gerado = new boolean[50]; // Array para marcar os números gerados

        System.out.println("Lista:");
        int count = 0;
        while (count < 10) {
            int num = random.nextInt(50) + 1;
            if (!gerado[num - 1]) { // Verifica se o número já foi gerado
                lista[count] = num;
                gerado[num - 1] = true; // Marca o número como gerado
                System.out.println(lista[count]);
                count++;
            }
        }
    }
}