package br.edu.fatecpg.correcao.view;
import br.edu.fatecpg.correcao.model.PostoCombustivel;
import java.util.Scanner;

public class MainPostoCombustivel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op;
        int indice;
        int quantidade;
        String[] tipos = {"Gasolina", "Etanol", "Álcool"};
        double[] precos = {6.20, 5.90, 3.90};
        int[] litros = {100, 150, 200};
        PostoCombustivel posto1 = new PostoCombustivel(tipos, precos, litros);

        do{
            System.out.println("===== POSTO DE COMBUSTÍVEL =====");
            System.out.println("1 - Monitoramento global");
            System.out.println("2 - Avaliação patrimonial");
            System.out.println("3 - Análise de inventário");
            System.out.println("4 - Realizar venda");
            System.out.println("5 - Reabastecer estoque");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            op = scan.nextInt();

            switch(op){
                case 1:
                    posto1.MonitoramentoGlobal();
                break;

                case 2:
                    System.out.println("Patrimônio total: R$ " + posto1.AvaliaçãoPatrimonial());
                break;

                case 3:
                    System.out.println(posto1.AnaliseInventario());
                break;

                case 4:
                    System.out.println("Escolha o índice de um dos tipos de combustível:");
                    System.out.println("0 - Gasolina");
                    System.out.println("1 - Etanol");
                    System.out.println("2 - Álcool");
                    System.out.print("Digite o índice: ");
                    indice = scan.nextInt();
                    System.out.print("Digite quantos litros deseja: ");
                    quantidade = scan.nextInt();
                    posto1.OperacaoVenda(indice, quantidade);
                break;

                case 5:
                    System.out.println("Escolha o índice de um dos tipos de combustível:");
                    System.out.println("0 - Gasolina");
                    System.out.println("1 - Etanol");
                    System.out.println("2 - Álcool");
                    System.out.print("Digite o índice: ");
                    indice = scan.nextInt();
                    System.out.print("Digite quantos litros serão adicionados: ");
                    quantidade = scan.nextInt();
                    posto1.Reabastecer(indice, quantidade);
                break;

                case 0:
                    System.out.println("Encerrando...");
                break;

                default:
                    System.out.println("Opção Inválida!");
            }

        }while(op != 0);
        scan.close();
    }
}
