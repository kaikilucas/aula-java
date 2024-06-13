package kaiki.lucas.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Contador " + i);
            if (i > 25) {

                break;
            }
            System.out.println("Chegou em 25 parou " + i);
        }
    }
}
