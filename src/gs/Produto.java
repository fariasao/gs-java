package gs;

public class Produto {
    private int codigoProduto;
    private String nome;

    public Produto(int codigoProduto, String nome) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getNome() {
        return nome;
    }
}

