public class Media {
    private float soma, contador;

    public Media() {
        soma = 0;
        contador = 0;
    }

    public void Acrescenta(float valor) {
        soma += valor;
        contador ++;
    }

    public void MediaAtual() {
        System.out.println("A média atual é: " + soma/contador);
    }
}
