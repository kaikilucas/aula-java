package kaiki.lucas.javacore.Aintroducaoclasses.test;

import kaiki.lucas.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Raimundo";
        professor.idade = 25;
        professor.sexo = 'M';
        System.out.println("Nome: "+professor.nome +  "\n"+ "idade: " + professor.idade +  "\n"+ "Sexo: " + professor.sexo);
    }
}
