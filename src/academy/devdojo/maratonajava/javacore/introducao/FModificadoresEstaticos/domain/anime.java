package academy.devdojo.maratonajava.javacore.introducao.FModificadoresEstaticos.domain;

public class anime {
    public String anime;
    public static int[] episodios;

    static {
        episodios = new int[100];
        for (int i = 1; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public anime(String anime) {
        this.anime = anime;
    }

    public anime() {
        for(int episodios : this.episodios) {
            System.out.println(episodios + " ");
        }
    }

    public String getAnime() {
        return anime;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
