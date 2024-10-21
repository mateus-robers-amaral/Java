import java.util.Random;

public class exercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] pares = new int[10];
        int[] impares = new int[10];
        int x = 0;
        int y = 0;

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(50) + 1;
            if (num % 2 == 0 && x < 10) {
                pares[x] = num;
                x++;
            } else if (y < 10) {
                impares[y] = num;
                y++;
            }
        }

        System.out.println("Quantidade de pares: " + x);
        System.out.println("Quantidade de ímpares: " + y);

    }
}