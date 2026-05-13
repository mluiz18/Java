package academy.devdojo.maratonajava.javacore.introducao.DConstrutores.teste;

import academy.devdojo.maratonajava.javacore.introducao.DConstrutores.dominio.anime;

public class animeTeste01 {
    public static void main(String[] args) {
        anime an1 = new anime("One Piece", "Anime", 1089, "Oda","Mappa");

        System.out.println(an1.getEpisodios());
        System.out.println(an1.getNome());
        System.out.println(an1.getTipo());
        System.out.println(an1.getAutor());
        System.out.println(an1.getEstudio());
    }
}
