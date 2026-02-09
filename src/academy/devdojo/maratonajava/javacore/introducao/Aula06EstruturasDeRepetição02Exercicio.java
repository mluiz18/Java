package academy.devdojo.maratonajava.javacore.introducao;

/**
 * Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado, aonde o valor da parcela é >= 1000
 */
public class Aula06EstruturasDeRepetição02Exercicio {
    public static void main(String[] args) {
        int valorCarro = 30000;

        for (int parcela = 1; parcela < valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            } else {
                System.out.println("Parcela: " + parcela);
            }

        }

    }
}
