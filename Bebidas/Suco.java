package Bebidas;

public class Suco extends Bebida {
    private String sabor;

    public Suco(String nome, double preco, String sabor) {
        super(nome, preco);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void mostraBebida() {
        System.out.println("Suco: " + nome + ", Preço: R$" + preco + ", Sabor: " + sabor);
    }
}
