package br.edu.fatecpg.correcao.view;
import br.edu.fatecpg.correcao.model.ContaBancaria;

public class MainContaBancaria{
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria();
        c1.setTitular("Adalberto da Silva");
        c1.setNumeroConta(6767);
        c1.setSaldo(3905.67);
            
        System.out.println("Nome do titular: " + c1.getTitular());
        System.out.println("Número da conta: " + c1.getNumeroConta());
        System.out.println("Saldo: " + c1.getSaldo());
        
    }
}