public class Retangulo1{
    private int base, altura;
    
    public Retangulo1(int b, int a) {
        base = b;
        altura = a;
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
