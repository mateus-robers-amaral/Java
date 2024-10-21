import java.util.Random;
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int [] A = new int[10];
        int [] B = new int[10];
        
        System.out.println("Vetor A:");
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(50) + 1;
            A[i] = num;
            System.out.println(A[i]);
        }
        System.out.println("Digite um valor para multiplicar os itens de A:");
        int resp = entrada.nextInt();

        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = A[i] * resp;
            System.out.println(B[i]);
        }
        entrada.close();
    }
}
