package Heranca;

public class Principal {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        System.out.println("Salário do Vendedor:" + v.Salario());

        Gerente g = new Gerente();
        System.out.println("Salário do Gerente:" + g.Salario());
        
        Horista h = new Horista();
        System.out.println("Salário do Horista:" + h.Salario());

    }

}
