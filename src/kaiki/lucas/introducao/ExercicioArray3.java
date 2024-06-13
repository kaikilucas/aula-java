package kaiki.lucas.introducao;

public class ExercicioArray3 {
    public static void main(String[] args) {
        int[] numeros = {5, 1, 8, 4, 1};
        int maiorNumero = numeros[0];
        int menorNumero = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }


            }

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];

            }

            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];

            }
        }
        for (int num : numeros) {
            System.out.println(num);

        }
        System.out.println("Maior Numero "+ maiorNumero);
        System.out.println("Menor Numero " + menorNumero);
    }
}


