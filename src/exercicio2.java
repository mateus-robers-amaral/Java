import java.util.Random;
public class exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] lista = new int[20];
        int [] pares = new int[20];
        int x = 0;
        int soma = 0;

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(50) + 1;
            lista[i] = num;

            if (num % 2 == 0) {
                pares[x] = num;
                x++;
            }
        }
        System.out.println("Lista completa: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Lista de pares: ");
        for (int i = 0; i < 20; i++) {
            if (pares[i] == 0) {
                break;
            }
            else {
                System.out.println(pares[i]);
                soma += pares[i];
            }
        }
        System.out.println("A média dos números pares é: " + soma / pares.length);
    }
}