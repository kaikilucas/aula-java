package kaiki.lucas.introducao;

public class ExercicioArray2 {
    public static void main(String[] args) {
        //Exercício 2: Encontrar o Menor Elemento do Array
        //Descrição: Crie um programa que encontre o menor elemento em um array de inteiros.

        //o menor é 1 o maior é 5,
        // temos 10 de lenght 1
        // 9 de indice

        int[] numeros = {1, 4, 8, 5, 8};
        int maiorNumero = 0;
        int menorNumero = 0;
        for (int i = 0; i < numeros.length; i++) {
          if(numeros[i] == 1){
              menorNumero = numeros[i];
          }
            if (maiorNumero < numeros[i]) {
                maiorNumero = numeros[i];
            }
            ;
            if (menorNumero > numeros[i]) {
                menorNumero = numeros[i];

            }

        }
        System.out.println("Maior numero "+maiorNumero);
        System.out.println("Menor numero "+menorNumero);
    }


}


