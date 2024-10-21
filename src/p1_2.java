import java.util.Scanner;

public class p1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;

        System.out.print("Quantas notas serão digitadas?\n--> ");
        int reps = scanner.nextInt();

        double[] notas = new double[reps];

        for (int i = 0; i < reps; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota\n--> ");
            double nota = scanner.nextInt();
            notas[i] = nota;
        }

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
            System.out.println(notas[i]);
        }

        System.out.println("Você inseriu " + reps + " notas.");
        System.out.println("Sua média é: " + media/reps);

        if (media/reps >= 9) {
        System.out.println("Seu desempenho foi classificado como: Excelente!");
        }

        else if (media/reps >= 7 && media/reps < 9) {
        System.out.println("Seu desempenho foi classificado como: Bom!");
        }

        else if (media/reps >= 5 && media/reps < 7) {
        System.out.println("Seu desempenho foi classificado como: Regular!");
        }

        else if (media/reps < 5) {
        System.out.println("Seu desempenho foi classificado como: Insuficiente!");
        }
        
        scanner.close();
    }
}
