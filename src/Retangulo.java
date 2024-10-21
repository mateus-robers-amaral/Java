public class Retangulo {
    private int base, altura;
    
    
    public Retangulo(int b, int a) {
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
}
