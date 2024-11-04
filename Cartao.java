import java.util.Scanner;

public class Cartao {
    private int senha;

    public Cartao() {
        cadastrarSenha();
    }

    private void cadastrarSenha() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha do cartão: ");
        int senhaTemp = scanner.nextInt();

        System.out.print("Digite novamente a senha do cartão: ");
        int senhaTemp2 = scanner.nextInt();

        if (senhaTemp == senhaTemp2) {
            this.senha = senhaTemp;
            System.out.println("Senha cadastrada com sucesso.");
        } else {
            System.out.println("As senhas não coincidem. Tente novamente.");
            System.exit(1); 
        }
    }

    public boolean verificaSenha(int senha) {
        if (this.senha == senha) {
            System.out.println("Senha correta.");
            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    public void alterarSenha() {
        System.out.println("Alteração de senha:");
        cadastrarSenha();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cartao cartao = new Cartao();

        System.out.print("Digite a senha para verificar: ");
        int senhaParaVerificar = scanner.nextInt();

        cartao.verificaSenha(senhaParaVerificar);

        scanner.close();
    }
}
