package br.edu.fatecpg.correcao.model;

public class Celular{
    public String marca;
    public String modelo;
    public double preco;
    public String estado;
    public String defeito;

    public Celular(String marca, String modelo, double preco, String estado, String defeito){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.estado = estado;
        this.defeito = defeito;
    }
}