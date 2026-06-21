package academy.devdojo.maratonajava.javacore.introducao.EBlocosinicialização.test;

import academy.devdojo.maratonajava.javacore.introducao.EBlocosinicialização.domain.anime;

public class animeteste01 {
    public static void main(String[] args) {
       anime anime = new anime("One Piece");

       System.out.println(anime.getEpisodios());
    }
}
