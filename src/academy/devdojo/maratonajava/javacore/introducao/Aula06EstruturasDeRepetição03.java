package academy.devdojo.maratonajava.javacore.introducao;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        int valorCarro = 30000;

        for (int parcela = valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro/parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
