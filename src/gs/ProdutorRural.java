package gs;

public class ProdutorRural {
    private int codigoProdutor;
    private String nome;
    private String tipo;
    private double areaPlantio;
    private String nomeFantasia;
    private String email;
    private String telefone;

    public ProdutorRural(int codigoProdutor, String nome, String tipo, double areaPlantio,
                         String nomeFantasia, String email, String telefone) {
        this.codigoProdutor = codigoProdutor;
        this.nome = nome;
        this.tipo = tipo;
        this.areaPlantio = areaPlantio;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.telefone = telefone;
    }

    public int getCodigoProdutor() {
        return codigoProdutor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getAreaPlantio() {
        return areaPlantio;
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

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos operacionais
    
    // atualiza os contatos do produtor
    public void atualizarContato(String email, String telefone) {
        setEmail(email);
        setTelefone(telefone);
    }

    // compara quando produtor tem uma area adicional com a areaPlantio ja feito e soma elas
    public double calcularAreaPlantioTotal(double areaAdicional) {
        return this.areaPlantio + areaAdicional;
    }
    
    // verificação se o produtor possui area maior do que é preciso
    public boolean possuiAreaPlantioMaiorQue(double valor) {
        return areaPlantio > valor;
    }
    
    public String toString() {
        return "Código do Produtor: " + codigoProdutor + "\n" +
               "Nome: " + nome + "\n" +
               "Tipo: " + tipo + "\n" +
               "Área de Plantio: " + areaPlantio + "\n" +
               "Nome Fantasia: " + nomeFantasia + "\n" +
               "Email: " + email + "\n" +
               "Telefone: " + telefone;
    }
}

