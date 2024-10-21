import java.util.Scanner;
public class exercicio {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a [] = new int[5];
        int i;
        int maior = 0;
        int menor = 10000000;

        for (i = 0; i < 5; i++) {
            System.out.print("A ["+i+"] = ");
            a[i] = entrada.nextInt();
            if (a[i] > maior) {
                maior = a[i];
            }
            if (a[i] < menor) {
                menor = a[i];
            }
        }
        
        System.out.println("Vetor lido:");
        for (i = 0; i < 5; i++) {
            System.out.print(" A ["+i+"] = " + a[i]);
            if (a[i] == menor) System.out.print(" -> Menor valor ");
            if (a[i] == maior) System.out.print(" -> Maior valor ");
        }
        entrada.close();
    }
}