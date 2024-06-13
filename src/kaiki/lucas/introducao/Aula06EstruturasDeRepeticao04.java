package kaiki.lucas.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        int valorDoCarro = 30000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorDaParcela = valorDoCarro / parcela;
            if (valorDaParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);
//            if (valorDaParcela >= 1000) {
//                System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);
//
//            }else{
//                break;
//            }
        }
    }
}
