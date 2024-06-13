package kaiki.lucas.javacore.Aintroducaoclasses.test;

import kaiki.lucas.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 =new Carro();

        carro1.nome = "Fiesta";
        carro1.modelo = "1.6";
        carro1.ano = 2007;


        carro2.nome = "Siena";
        carro2.modelo = "1.0";
        carro2.ano = 2010;

        System.out.println("\nCarro 11");
        System.out.println("Nome: " + carro1.nome +  "\nModelo: " + carro1.modelo +  "\nAno: " + carro1.ano);
        System.out.println();
        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome +  "\nModelo: " + carro2.modelo +  "\nAno: " + carro2.ano);


    }

}