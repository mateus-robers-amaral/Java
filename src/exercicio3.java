import java.util.Random;
public class exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] lista = new int[20];
        int [] mult5 = new int[20];
        int x = 0;
        
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(50) + 1;
            lista[i] = num;

            if (num % 5 == 0) {
                mult5[x] = num;
                x++;
            }
        }
        System.out.println("Lista completa: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Lista de m[ultiplos de 5: ");
        for (int i = 0; i < 20; i++) {
            if (mult5[i] == 0) {
                break;
            }
            else {
                System.out.println(mult5[i]);
            }
        }
    }
}