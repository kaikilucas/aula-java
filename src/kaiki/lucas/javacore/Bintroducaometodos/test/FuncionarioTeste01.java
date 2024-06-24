package kaiki.lucas.javacore.Bintroducaometodos.test;

import kaiki.lucas.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();


        funcionario01.setNome("Kaiki");
        funcionario01.setIdade(25);
        funcionario01.setIdade(25);
        funcionario01.setSalarios(new double[]{7500, 6500, 9000});

//      funcionario02.nome = "Lucas";
//        funcionario02.idade = 42;
//        funcionario02.salarios = new double[]{14000, 18000, 19000};

        funcionario01.imprimirDados();
        System.out.println("Funcionario 1");

        System.out.println("Média " + funcionario01.getMedia());


    }
}
