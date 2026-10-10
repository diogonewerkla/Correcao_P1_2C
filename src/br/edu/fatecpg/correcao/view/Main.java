package br.edu.fatecpg.correcao.view;
import br.edu.fatecpg.correcao.model.Celular;

public class Main{
    public static void main(String[] args){
        Celular c1 = new Celular("Apple", "Iphone 15", 3.99999, "Usado", "Tela quebrada");
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Preço: " + c1.preco);
        System.out.println("Estado: " + c1.estado);
        System.out.println("Defeito: " + c1.defeito);

    }
}