package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condicoes, mas vou ter!";
        String resultado;

        resultado = (salario >= 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
