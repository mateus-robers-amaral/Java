package Bebidas;

public class Vinho extends Bebida {
    private int safra;

    public Vinho(String nome, double preco, int safra) {
        super(nome, preco);
        this.safra = safra;
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

    public void mostraBebida() {
        System.out.println("Vinho: " + nome + ", Preço: R$" + preco + ", Safra: " + safra);
    }
}
