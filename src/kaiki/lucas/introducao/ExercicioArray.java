package kaiki.lucas.introducao;

public class ExercicioArray {
    //Exercício 1: Contar Números Pares
   // Descrição: Crie um programa que conte quantos números pares existem em um array de inteiros.

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numerosPares = 0;

      for(int numero : numeros){
          if (numero % 2 == 0) {
              System.out.println("esse é par "+numero);
              numerosPares ++;
        }

    }
        System.out.println("Tem " + numerosPares + " numeros Pares nesse Array");
}
}
