package academy.devdojo.maratonajava.javacore.introducao.Bintroduçãometodos.teste;

import academy.devdojo.maratonajava.javacore.introducao.Bintroduçãometodos.dominio.calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        calculadora cal = new calculadora();
        System.out.println(cal.somaDoisNumeros(4,6));
    }
}
