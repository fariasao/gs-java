package gs;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objeto da classe App
        App app = new App();

        // Obtendo valores do usuário para criar um objeto ProdutorRural
        System.out.println("Informe os dados do Produtor Rural:");
        System.out.print("Código do Produtor: ");
        int codigoProdutor = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado
        System.out.print("Nome: ");
        String nomeProdutor = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipoProdutor = scanner.nextLine();
        System.out.print("Área de Plantio: ");
        double areaPlantio = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do teclado
        System.out.print("Nome Fantasia: ");
        String nomeFantasiaProdutor = scanner.nextLine();
        System.out.print("Email: ");
        String emailProdutor = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneProdutor = scanner.nextLine();

        // Criando objeto ProdutorRural com os valores informados pelo usuário
        ProdutorRural produtorRural = new ProdutorRural(codigoProdutor, nomeProdutor, tipoProdutor,
                areaPlantio, nomeFantasiaProdutor, emailProdutor, telefoneProdutor);

        // Adicionando o produtor rural ao app
        app.adicionarProdutor(produtorRural);

        // Obtendo valores do usuário para criar um objeto EmpresaTecnologia
        System.out.println("\nInforme os dados da Empresa de Tecnologia:");
        System.out.print("Código da Empresa: ");
        int codigoEmpresa = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado
        System.out.print("Nome: ");
        String nomeEmpresa = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipoEmpresa = scanner.nextLine();
        System.out.print("Nome Fantasia: ");
        String nomeFantasiaEmpresa = scanner.nextLine();
        System.out.print("Email: ");
        String emailEmpresa = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneEmpresa = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoEmpresa = scanner.nextLine();
        System.out.print("Representante: ");
        String representanteEmpresa = scanner.nextLine();

        // Criando objeto EmpresaTecnologia com os valores informados pelo usuário
        EmpresaTecnologia empresaTecnologia = new EmpresaTecnologia(codigoEmpresa, nomeEmpresa, tipoEmpresa,
                nomeFantasiaEmpresa, emailEmpresa, telefoneEmpresa, enderecoEmpresa, representanteEmpresa);

        // Adicionando a empresa de tecnologia ao app
        app.adicionarEmpresa(empresaTecnologia);

        // Exibindo os valores dos atributos do produtor rural
        System.out.println("\nDados do Produtor Rural:");
        System.out.println("Código: " + produtorRural.getCodigoProdutor());
        System.out.println("Nome: " + produtorRural.getNome());
        System.out.println("Tipo: " + produtorRural.getTipo());
        System.out.println("Área de Plantio: " + produtorRural.getAreaPlantio());
        System.out.println("Nome Fantasia: " + produtorRural.getNomeFantasia());
        System.out.println("Email: " + produtorRural.getEmail());
        System.out.println("Telefone: " + produtorRural.getTelefone());

        // Exibindo os valores dos atributos da empresa de tecnologia
        System.out.println("\nDados da Empresa de Tecnologia:");
        System.out.println("Código: " + empresaTecnologia.getCodigoEmpresa());
        System.out.println("Nome: " + empresaTecnologia.getNome());
        System.out.println("Tipo: " + empresaTecnologia.getTipo());
        System.out.println("Nome Fantasia: " + empresaTecnologia.getNomeFantasia());
        System.out.println("Email: " + empresaTecnologia.getEmail());
        System.out.println("Telefone: " + empresaTecnologia.getTelefone());
        System.out.println("Endereço: " + empresaTecnologia.getEndereco());
        System.out.println("Representante: " + empresaTecnologia.getRepresentante());

        scanner.close();
    }
}

