package kaiki.lucas.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros1 = {1, 2, 3, 4};
        int[] numeros2 = new int[]{1, 2, 3, 4, 5};
        int contador = 0;
        for (int i = 0; i < numeros1.length; i++) {
            contador += numeros1[i];
        }
        System.out.println(contador);
    }
}
