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

    public double calcularAreaPlantioTotal(double areaAdicional) {
        return areaPlantio + areaAdicional;
    }
}

