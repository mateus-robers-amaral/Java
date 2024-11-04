import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        Cartao cartao = new Cartao();

        boolean acessoPermitido = false;
        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.print("Digite a senha para verificar: ");
            int senhaParaVerificar = scanner.nextInt();

            if (cartao.verificaSenha(senhaParaVerificar)) {
                acessoPermitido = true;
                break;
            } else {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Acesso negado. Número máximo de tentativas excedido.");
            scanner.close();
            System.exit(0);
        }

        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + conta.getNome());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo Inicial: " + conta.consultaSaldo());

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Deposito");
            System.out.println("2 - Retirada");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Alterar Senha");
            System.out.println("5 - Finalizar");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor para depositar: ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            } else if (opcao == 2) {
                System.out.print("Digite o valor para retirar: ");
                double valor = scanner.nextDouble();
                boolean sucesso = conta.retirar(valor);
                if (!sucesso) {
                    System.out.println("Operação de retirada falhou.");
                }
            } else if (opcao == 3) {
                System.out.println("Saldo atual: " + conta.consultaSaldo());
            } else if (opcao == 4) {
                cartao.alterarSenha();
            } else if (opcao == 5) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
