package academy.devdojo.maratonajava.exercicios.banco.domain;

public class verificacao {

    public boolean isOverEqualsEighteen(int idade) {
        if (idade >= 18) {
            return true;
        }
        return false;
    }

    public boolean isCpfValid(String cpf){
        return true;
    }

    public boolean isSalaryAcceptable(double salario) {
        if (salario < 1200) {
            return false;
        }
        return true;
    }
}
