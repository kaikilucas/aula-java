package kaiki.lucas.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print("Salario: " + salario + " ");
        }
        mediaSalario();

    }

    public void mediaSalario() {
        if (salarios == null) {
            return;
        }
        double resultado = 0;

        for (
                double num : salarios) {
            resultado += num;
        }

        resultado /= salarios.length;
        System.out.println("\nMédia do Salário: " + resultado);
    }

}


