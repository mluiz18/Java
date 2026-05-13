package academy.devdojo.maratonajava.javacore.introducao.DConstrutores.dominio;

public class anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String autor;
    private String Estudio;


    public anime(String nome, String tipo, int episodios, String autor) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.autor = autor;
    }

    public anime(String nome, String tipo, int episodios, String autor, String Estudio) {
        this(nome, tipo, episodios, autor);
        this.Estudio = Estudio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstudio() {
        return Estudio;
    }

    public void setEstudio(String estudio) {
        Estudio = estudio;
    }
}

