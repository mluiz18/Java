package academy.devdojo.maratonajava.javacore.introducao.CSobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.introducao.CSobrecargametodos.dominio.anime;

public class animeTeste01 {
    public static void main(String[] args) {
        anime an1 = new anime();
        an1.init("One Piece", "Anime", 1089, "Oda");

        System.out.println(an1.getEpisodios());
        System.out.println(an1.getNome());
        System.out.println(an1.getTipo());
        System.out.println(an1.getAutor());
    }
}
