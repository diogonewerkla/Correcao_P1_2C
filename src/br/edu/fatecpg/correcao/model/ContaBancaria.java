package br.edu.fatecpg.correcao.model;

public class ContaBancaria{
    private String titular;
    private int numeroConta;
    private double saldo;
    
    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}