import java.util.Random;

public class p1_1 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + random.nextInt(50);
            if (numeros[i] % 5 == 0) {
                System.out.println(numeros[i]);
            }
        }

    }
}
