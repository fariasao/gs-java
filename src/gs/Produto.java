package gs;

public class Produto {
    private int codigoProduto;
    private String nome;
    private String descricao;
    private double valorProduto;

    public Produto(int codigoProduto, String nome, String descricao, double valorProduto) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.valorProduto = valorProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getNome() {
        return nome;
    }

	public double getValorProduto() {
		return valorProduto;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
        return "Código: " + codigoProduto +
                "\nNome: " + nome +
                "\nDescricao: " + descricao +
                "\nValor: " + valorProduto;
    }
}

