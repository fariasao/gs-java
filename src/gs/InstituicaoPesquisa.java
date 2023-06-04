package gs;

import java.util.ArrayList;
import java.util.List;

public class InstituicaoPesquisa {
    private int codigoInstituicao;
    private String nome;
    private String tipo;
    private String nomeFantasia;
    private String email;
    private String telefone;
    private String endereco;
    private String representante;
    private List<Projeto> projetos;

    public InstituicaoPesquisa(int codigoInstituicao, String nome, String tipo, String nomeFantasia,
                               String email, String telefone, String endereco, String representante) {
        this.codigoInstituicao = codigoInstituicao;
        this.nome = nome;
        this.tipo = tipo;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.representante = representante;
        projetos = new ArrayList<>();
    }

    public int getCodigoInstituicao() {
        return codigoInstituicao;
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

    // Métodos operacionais
    
    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public void removerProjeto(Projeto projeto) {
        projetos.remove(projeto);
    }

    public List<Projeto> obterProjetos() {
        return projetos;
    }
    
    // Sobrecarga do método adicionarProjeto para receber título e código do projeto
    public void adicionarProjeto( int codigo, String nome, String descricao, String itensNecessarios) {
        Projeto projeto = new Projeto(codigo, nome, descricao, itensNecessarios);
        projetos.add(projeto);
    }


    public String toString() {
        return "Código da Instituição: " + codigoInstituicao + "\n" +
               "Nome: " + nome + "\n" +
               "Tipo: " + tipo + "\n" +
               "Nome Fantasia: " + nomeFantasia + "\n" +
               "Email: " + email + "\n" +
               "Telefone: " + telefone + "\n" +
               "Endereço: " + endereco + "\n" +
               "Representante: " + representante;
    }
}

