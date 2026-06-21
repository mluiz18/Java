package academy.devdojo.maratonajava.javacore.introducao.FModificadoresEstaticos.teste;

import academy.devdojo.maratonajava.javacore.introducao.FModificadoresEstaticos.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Mazda", 358);
        Carro c2 = new Carro("Porsche", 300);
        Carro c3 = new Carro("Mercedes-Benz", 303);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
