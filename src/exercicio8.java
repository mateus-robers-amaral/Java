import java.util.Random;
public class exercicio8 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] A = new int[20];
        int [] B = new int[20];
        int [] C = new int[20];
        
        System.out.println("Vetor A:");
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(50) + 1;
            A[i] = num;
            System.out.println(A[i]);

            if (num % 2 == 0) {
                B[i] = num;
            }
            else {
                C[i] = num;
            }
        }
        System.out.println("Vetor B:");
        for (int i = 0; i < 20; i++) {
            if (B[i] == 0) {
                continue;
            }
            else {
                System.out.println(B[i]);
            }
        }
        
        System.out.println("Vetor C:");
        for (int i = 0; i < 20; i++) {
            if (C[i] == 0) {
                continue;
            }
            else {
                System.out.println(C[i]);
            }
        }
    }
}
