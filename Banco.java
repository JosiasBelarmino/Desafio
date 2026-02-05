import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Josias Belarmino da Silva";
        String conta = "Corrente";
        double saldo = 2500;
        int escolha = 0;
        double adicao = 0;
        double valorTransferencia = 0;
        int n = 50;

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println("\nDados Pessoais:");
        System.out.println(String.format("%-15s: %s","Nome",nome));
        System.out.println(String.format("%-15s: %s","Tipo de Conta:",conta));
        System.out.println(String.format("%-15s: %.2f", "Saldo: ",saldo));

        while(escolha != 4){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        //PODERIA FAZER UMA VARIAVEL COM ESSA OPÇÃO E CHAMAR DENTRO DO SOUT O MENU, MAS PREFERI ASSIM AINDA!
        System.out.println("\n\nOperações");
        System.out.println("""
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Tranferir Valor
                4 - Sair
                """);
        System.out.println("Qual opção deseja escolher: ");
        escolha = leitor.nextInt();


            if (escolha == 1) {
                System.out.println(String.format("O saldo atual é R$%.2f",saldo));

            } else if (escolha == 2) {
                System.out.println("Informe o valor a receber: ");
                saldo += adicao = leitor.nextDouble();
                System.out.println(String.format("Seu novo saldo é R$%.2f",saldo));
            } else if (escolha == 3) {
                System.out.println("Qual valor deseja transferir? ");
                valorTransferencia = leitor.nextDouble();
                if (valorTransferencia > saldo){
                    System.out.println("Saldo insuficiente para essa transação!");
                }else{
                    saldo = saldo-valorTransferencia;
                    System.out.println(String.format("Valor transferido com sucesso! Saldo restante é R$%.2f",saldo));
                }

            }else if(escolha == 4){
                System.out.println("Obrigado pela preferencia!");

            } else{
                System.out.println("Opção Invalida!");
            }

        }

    }
}
