package academy.devdojo.maratonajava.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.Aintroduçãoclasses.domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Ricardo";
        professor.sexo = 'M';
        professor.Idade = 47;

        System.out.println(professor.nome + professor.sexo + professor.Idade);
    }
}
