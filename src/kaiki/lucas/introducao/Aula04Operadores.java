package kaiki.lucas.introducao;


public class Aula04Operadores {
    public static void main(String[] args) {
        //OPERADORES ARITIMÉTICOS + * / %
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02; // numeros inteiros sempre vai retornar numeros inteiros.
        System.out.println(resultado);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        // OPERADORES LOGICOS SEMPRE VÃO RETORNAR VALORES BOOLEANOS // RELACIONAIS
        // < > <= >=  ==  !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        }}