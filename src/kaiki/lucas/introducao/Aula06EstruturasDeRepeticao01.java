package kaiki.lucas.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("dentro do do-while");
        } while (count < 10);



    }
}
