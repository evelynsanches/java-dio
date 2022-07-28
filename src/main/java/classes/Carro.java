package classes;

public class Carro {

    public Carro(String marca, String modelo, Integer ano, String variante) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;
    }

    Integer pessoa = 9;
    String marca;
    String modelo;
    Integer ano;
    String variante;


    public Integer getQuantidade() { return pessoa; }

    public String adicionarPessoas() { return "Olá, você tem " + pessoa + " pessoas. " +
            "Adicionando mais pessoas.."; }

    public String removerPessoas() { return "Olá, você tem " + pessoa + " pessoas. " +
            "Removendo pessoas.."; }

    public String getModelo() { return modelo; }

}
