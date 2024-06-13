package kaiki.lucas.javacore.Aintroducaoclasses.test;

import kaiki.lucas.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fiat";
        carro.modelo = "Siena 1.0";
        carro.ano = 2010;
        System.out.println("Marca: " + carro.nome + "\n" + "Modelo: " + carro.modelo + "\n" + "Ano: " + carro.ano);
    }
}
