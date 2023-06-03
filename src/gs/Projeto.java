package gs;

public class Projeto {
    private int codigoProjeto;
    private String titulo;

    public Projeto(int codigoProjeto, String titulo) {
        this.codigoProjeto = codigoProjeto;
        this.titulo = titulo;
    }

    public int getCodigoProjeto() {
        return codigoProjeto;
    }

    public String getTitulo() {
        return titulo;
    }
}
