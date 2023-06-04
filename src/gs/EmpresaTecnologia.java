package gs;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTecnologia {
    private String codigoEmpresa;
    private String nome;
    private String tipo;
    private String nomeFantasia;
    private String email;
    private String telefone;
    private String endereco;
    private String representante;
    private List<Produto> produtos;

    public EmpresaTecnologia(String codigoEmpresa, String nome, String tipo, String nomeFantasia,
                             String email, String telefone, String endereco, String representante) {
        this.codigoEmpresa = codigoEmpresa;
        this.nome = nome;
        this.tipo = tipo;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.representante = representante;
        produtos = new ArrayList<>();
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public List<Produto> obterProdutos() {
        return produtos;
    }

    // Métodos operacionais

    // sobrecarga do metodo adicionar
    public void adicionarProduto(int codigoProduto, String nome,String descricao, double valorProduto) {
        Produto produto = new Produto(codigoProduto, nome, descricao, valorProduto);
        produtos.add(produto);
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Produtos: " + this.produtos.toString());
        System.out.println("Representante: " + this.representante);
    }

    // sobreescrita do metodo exibirInformações
    public String toString() {
        return "Nome: " + this.nome +
                "\nTipo: " + this.tipo +
                "\nNome Fantasia: " + this.nomeFantasia +
                "\nEmail: " + this.email +
                "\nTelefone: " + this.telefone +
                "\nEndereço: " + this.endereco +
                "\nProdutos: " + this.produtos.toString() +
                "\nRepresentante: " + this.representante;
    }
}

