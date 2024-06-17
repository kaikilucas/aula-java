package kaiki.lucas.javacore.Bintroducaometodos.test;

import kaiki.lucas.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       calculadora.divideDoisNumeros(20, 2);
        System.out.println(calculadora.divideDoisNumeros(20, 2));
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("--------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
