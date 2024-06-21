package kaiki.lucas.javacore.Bintroducaometodos.test;

import kaiki.lucas.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kaiki");
        pessoa.setIdade(25);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());



    }
}
