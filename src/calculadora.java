import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int op;

        System.out.print("Digite o primeiro número:\n--> ");
        num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número:\n--> ");
        num2 = scanner.nextInt();
        
        System.out.print("Selecione a operação:\n[1] Soma\n[2] Subtração\n[3] Divisão\n[4] Multiplicação\n--> ");
        op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
        
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case 3:
                System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                break;

            case 4:
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;

            default:
                System.out.println("Opção Inválida!");
        }
        
        scanner.close();

    }
}
