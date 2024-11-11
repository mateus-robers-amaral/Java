package Bebidas;

public class Refrigerante extends Bebida {
    private boolean retornavel;

    public Refrigerante(String nome, double preco, boolean retornavel) {
        super(nome, preco);
        this.retornavel = retornavel;
    }

    public boolean isRetornavel() {
        return retornavel;
    }

    public void setRetornavel(boolean retornavel) {
        this.retornavel = retornavel;
    }

    public void mostraBebida() {
        System.out.println("Refrigerante: " + nome + ", Preço: R$" + preco + ", Retornável: " + (retornavel ? "Sim" : "Não"));
    }
}
