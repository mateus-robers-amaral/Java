import java.util.Scanner;
public class Principal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Media m = new Media();

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o " + (i+1) + "° valor");
            float num = scanner.nextInt();
            m.Acrescenta(num);
        }
        
        m.MediaAtual();
    }
}
