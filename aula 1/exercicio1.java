import java.util.Scanner;
public class exercicio1{
    
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
        System.out.println("Digite um número inteiro:");
        numero1 = entrada.nextInt();
        System.out.println("Digite um segundo número inteiro:");
        numero2 = entrada.nextInt();
        soma = (numero1 + numero2);
        System.out.println("A soma desses dois números é " + soma);
        entrada.close();
        
    }
}