package gs;

public class Projeto {
    private int codigoProjeto;
    private String nome;
    private String descricao;
    private String itensNecessarios;

    public Projeto(int codigoProjeto, String titulo, String descricao, String itensNecessarios) {
        this.codigoProjeto = codigoProjeto;
        this.nome = titulo;
        this.descricao = descricao;
        this.itensNecessarios = itensNecessarios;
    }

    public int getCodigoProjeto() {
        return codigoProjeto;
    }

    public String getNome() {
        return nome;
    }

	public String getDescricao() {
		return descricao;
	}

	public String getItensNecessarios() {
		return itensNecessarios;
	}
}
