package br.edu.fatecpg.correcao.model;

public class PostoCombustivel {
    public String[] tiposCombustivel;
    public double[] precosLitros;
    public int[] litrosDisponiveis;

    public PostoCombustivel(String[] tiposCombustivel, double[] precosLitros, int[] litrosDisponiveis){
        this.tiposCombustivel = tiposCombustivel;
        this.precosLitros = precosLitros;
        this.litrosDisponiveis = litrosDisponiveis;
    }

    public void MonitoramentoGlobal(){
        for(int i = 0; i < litrosDisponiveis.length; i++){
            System.out.println("Tipo de Combustivel: " + tiposCombustivel[i]);
            System.out.println("Preço por Litro: " + precosLitros[i]);
            System.out.println("Litros Disponiveis: "+ litrosDisponiveis[i]);
        }
    }

    public double AvaliaçãoPatrimonial(){
        double patrimonio = 0;

        for(int i = 0; i < litrosDisponiveis.length; i++){
            patrimonio += precosLitros[i] * litrosDisponiveis[i];
        }
        return patrimonio;
    }

    public String AnaliseInventario(){
        int maior = litrosDisponiveis[0];
        int menor = litrosDisponiveis[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        for(int i = 0; i < litrosDisponiveis.length; i++){
            if (maior < litrosDisponiveis[i]) {
                maior = litrosDisponiveis[i];
                indiceMaior = i;
            }
            if (menor > litrosDisponiveis[i]){
                menor = litrosDisponiveis[i];
                indiceMenor = i;
            }
        }
        return "O combustivel com maior estoque é " + tiposCombustivel[indiceMaior] + " contendo: " + maior + " Litros. E o que tem menor estoque é " + tiposCombustivel[indiceMenor] + " contendo: " + menor + " Litros.";
    }

    public void OperacaoVenda(int indice, int quantidade){
        if (indice < 0 || indice >= litrosDisponiveis.length) {
            System.out.println("Índice de combustível inválido!");
            return;
        }

        if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero!");
                return;
        }

        if(quantidade > litrosDisponiveis[indice]){
            System.out.println("Estoque insuficiente");
        }
        else{ 
            litrosDisponiveis[indice] -= quantidade;
            System.out.println("Venda concluída!");
        }
    }

    public void Reabastecer(int indice, int quantidade){
        if (indice < 0 || indice >= litrosDisponiveis.length){
            System.out.println("Índice de combustível inválido!");
            return;
        }

        if (quantidade <= 0){
            System.out.println("A quantidade deve ser maior que zero!");
            return;
        }

        litrosDisponiveis[indice] += quantidade;
        System.out.println("Estoque abastecido! O estoque agora está com " + litrosDisponiveis[indice] + " Litros.");
    }
}
