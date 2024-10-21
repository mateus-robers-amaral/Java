public class Principal {
    public static void main(String[] args) {

        Retangulo ret = new Retangulo(5, 3);

        System.out.println("A base do retangulo é " + ret.retornaBase());
        System.out.println("A altura do retangulo é " + ret.retornaAltura());
        System.out.println("A área do retangulo é " + ret.calcularArea());
        System.out.println("O perímetro do retangulo é " + ret.calcularPerimetro());

        Retangulo1 ret1 = new Retangulo1(1, 2);

        ret1.exibeArea();
        ret1.exibePerimetro();
    }
}
