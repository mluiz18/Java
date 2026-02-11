package academy.devdojo.maratonajava.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.Aintroduçãoclasses.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.nome = "Chevrolet";
        car1.modelo = "Monza";
        car1.ano = 1998;

        car2.nome = "Fiat";
        car2.modelo = "Uno";
        car2.ano = 2004;

        System.out.println(car1.nome);
        System.out.println(car1.modelo);
        System.out.println(car1.ano);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(car2.nome);
        System.out.println(car2.modelo);
        System.out.println(car2.ano);
    }
}
