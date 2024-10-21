import java.util.Scanner;
public class p1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome:\n--> ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade:\n--> ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu registro acadêmico:\n--> ");
        int ra = scanner.nextInt();

        int idadeFormatada = idade * 12;
        
        System.out.print("\nOlá " + nome);
        System.out.print("\nSeu Registro Acadêmico é: " + ra);
        System.out.print("\nVocê tem  " + idade + " anos, o que equivale a " + idadeFormatada + " meses.");

        scanner.close();
    }
}
