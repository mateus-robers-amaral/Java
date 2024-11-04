import java.util.Scanner;
public class Retangulo {
    private int base, altura;
    Scanner scanner = new Scanner(System.in);
    
    public Retangulo(int b, int a) {
        base = b;
        altura = a;
    }

    public Retangulo() {
        System.out.println("Informe a base: ");
        base = scanner.nextInt();
        System.out.println("Informe a altura: ");
        altura = scanner.nextInt();
    }

    public int retornaBase() {
        return base;
    }
    
    public int retornaAltura() {
        return altura;
    }

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public void exibeArea() {
        System.out.println("A área do retangulo é " + calcularArea());
    }
    
    public void exibePerimetro() {
        System.out.println("O perímetro do retangulo é " + calcularPerimetro());
    }
}
