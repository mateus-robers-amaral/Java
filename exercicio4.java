import java.util.Random;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int [] lista = new int[20];
        int [] mult = new int[20];
        int x = 0;
        int user;

        System.out.println("Digite o número: ");
        user = entrada.nextInt();
        
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(50) + 1;
            lista[i] = num;

            if (num % user == 0) {
                mult[x] = num;
                x++;
            }
        }
        System.out.println("Lista completa: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Lista de multiplos de " + user + " :");
        for (int i = 0; i < 20; i++) {
            if (mult[i] == 0) {
                break;
            }
            else {
                System.out.println(mult[i]);
            }
        }
        entrada.close();
    }
}