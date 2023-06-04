package gs;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objeto da classe App
        App app = new App();
        
        int opcao = 0;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // evistar bug do scanner

            switch (opcao) {
            case 1:
                cadastrarProdutor(app, scanner);
                break;
            case 2:
                cadastrarEmpresa(app, scanner);
                break;
            case 3:
                cadastrarInstituicao(app, scanner);
                break;
            case 4:
                cadastrarProduto(app, scanner);
                break;
            case 5:
                cadastrarProjeto(app, scanner);
                break;
            case 6:
                exibirProdutores(app);
                break;
            case 7:
                exibirEmpresas(app);
                break;
            case 8:
                exibirInstituicoes(app);
                break;
            case 9:
                exibirProdutos(app, scanner);
                break;
            case 10:
                exibirProjetos(app, scanner);
                break;
            case 11:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
            }
        } while (opcao != 11);

        scanner.close();
    }
    
    public static void exibirMenu() {
    	System.out.println("----- MENU -----");
        System.out.println("1 - Cadastrar Produtor");
        System.out.println("2 - Cadastrar Empresa");
        System.out.println("3 - Cadastrar Instituição");
        System.out.println("4 - Cadastrar Produto");
        System.out.println("5 - Cadastrar Projeto");
        System.out.println("6 - Exibir Produtores");
        System.out.println("7 - Exibir Empresas");
        System.out.println("8 - Exibir Instituições");
        System.out.println("9 - Exibir Produtos");
        System.out.println("10 - Exibir Projetos");
        System.out.println("11 - Sair");
        System.out.println("Escolha uma opção: ");
    }
    
    public static void cadastrarProdutor(App app, Scanner scanner) {
    	// Obtendo valores do usuário para criar um objeto ProdutorRural
        System.out.println("---- Cadastro de Produtor");
        System.out.print("Código do Produtor: ");
        int codigoProdutor = scanner.nextInt();
        scanner.nextLine();
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
        
        System.out.println("Produtor cadastrado com sucesso!");
    }
    
    public static void cadastrarEmpresa(App app, Scanner scanner) {
    	// Obtendo valores do usuário para criar um objeto EmpresaTecnologia
        System.out.println("---- Cadastro de Empresa ----");
        System.out.print("Código da Empresa: ");
        String codigoEmpresa = scanner.nextLine();
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
        
        System.out.println("Empresa cadastrada com sucesso!");
    }
    
    public static void cadastrarInstituicao(App app, Scanner scanner) {
    	System.out.println("---- Cadastro de Instituicao ----");
    	System.out.println("Código da instituicao: ");
    	int codigoInstituicao = scanner.nextInt();
    	scanner.nextLine();
    	System.out.print("Nome: ");
        String nomeInstituicao = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipoInstituicao = scanner.nextLine();
        System.out.print("Nome Fantasia: ");
        String nomeFantasiaInstituicao = scanner.nextLine();
        System.out.print("Email: ");
        String emailInstituicao = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneInstituicao = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoInstituicao = scanner.nextLine();
        System.out.print("Representante: ");
        String representanteInstituicao = scanner.nextLine();
    	
        InstituicaoPesquisa instituicaoPesquisa = new InstituicaoPesquisa(codigoInstituicao, nomeInstituicao, tipoInstituicao,
        		nomeFantasiaInstituicao, emailInstituicao, telefoneInstituicao, enderecoInstituicao, representanteInstituicao);
        
        app.adicionarInstituicao(instituicaoPesquisa);
        
        System.out.println("Instituição cadastrada com sucesso!");
    }
    
    public static void cadastrarProjeto(App app, Scanner scanner) {
        // Obtendo valores do usuário para criar um objeto Projeto
        System.out.println("---- Cadastro de Projeto ----");
        System.out.println("Escolha a instituição para associar o projeto:");
        exibirInstituicoes(app);
        int opcaoInstituicao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        // Verificar se a opção selecionada é válida
        List<InstituicaoPesquisa> instituicoes = app.obterInstituicoes();
        if (opcaoInstituicao >= 0 && opcaoInstituicao < instituicoes.size()) {
            InstituicaoPesquisa instituicao = instituicoes.get(opcaoInstituicao);

            System.out.print("Digite o código do projeto: ");
            int codigoProjeto = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do projeto: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a descrição do projeto: ");
            String descricao = scanner.nextLine();
            System.out.print("Digite os itens necessários para o projeto: ");
            String itensNecessarios = scanner.nextLine();

            Projeto projeto = new Projeto(codigoProjeto, nome, descricao, itensNecessarios);
            instituicao.adicionarProjeto(projeto);

            System.out.println("Projeto cadastrado com sucesso!\n");
        } else {
            System.out.println("Opção de instituição inválida. Cadastro de projeto cancelado.\n");
        }
    }
    
    public static void cadastrarProduto(App app, Scanner scanner) {
        // Obtendo valores do usuário para criar um objeto Produto
        System.out.println("---- Cadastro de Produto ----");
        System.out.println("Escolha a empresa para associar o produto:");
        exibirEmpresas(app);
        int opcaoEmpresa = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        // Verificar se a opção selecionada é válida
        List<EmpresaTecnologia> empresas = app.obterEmpresas();
        if (opcaoEmpresa >= 0 && opcaoEmpresa < empresas.size()) {
            EmpresaTecnologia empresa = empresas.get(opcaoEmpresa);

            System.out.print("Digite o código do produto: ");
            int codigoProduto = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a descrição do produto: ");
            String descricao = scanner.nextLine();
            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner

            Produto produto = new Produto(codigoProduto, nome, descricao, valor);
            empresa.adicionarProduto(produto);

            System.out.println("Produto cadastrado com sucesso!\n");
        } else {
            System.out.println("Opção de empresa inválida. Cadastro de produto cancelado.\n");
        }
    }
    
    public static void exibirProdutores(App app) {
        System.out.println("---- Produtores Cadastrados ----");
        List<ProdutorRural> produtores = app.obterProdutores();
        
        // listar produtores
        System.out.println("Lista de Produtores Rurais:");
        for (ProdutorRural produtor : produtores) {
            System.out.println(produtor.toString());
        }
    }
    
    public static void exibirEmpresas(App app) {
        System.out.println("---- Empresas Cadastradas ----");
        // obter a lista de empresas
        List<EmpresaTecnologia> empresas = app.obterEmpresas();
        
        // listar empresas
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println(i + " - " + empresas.get(i).toString());
        }
    }
    
    public static void exibirInstituicoes(App app) {
        System.out.println("---- Instituições Cadastradas ----");
        List<InstituicaoPesquisa> instituicoes = app.obterInstituicoes();

        for (int i = 0; i < instituicoes.size(); i++) {
            System.out.println(i + ". " + instituicoes.get(i).toString());
        }
    }
    
    public static void exibirProdutos(App app, Scanner scanner) {
        System.out.println("---- Produtos Cadastrados ----");
        List<EmpresaTecnologia> empresas = app.obterEmpresas();

        // Exibir lista de empresas
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println((i + 1) + ". " + empresas.get(i).getNome());
        }

        // Solicitar a seleção da empresa
        System.out.print("Selecione o número da empresa: ");
        int opcaoEmpresa = scanner.nextInt();
        scanner.nextLine();

        if (opcaoEmpresa < 1 || opcaoEmpresa > empresas.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        EmpresaTecnologia empresa = empresas.get(opcaoEmpresa - 1);
        List<Produto> produtos = empresa.obterProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Código: " + produto.getCodigoProduto());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Valor: " + produto.getValorProduto());
                System.out.println();
            }
        }
    }

    
    public static void exibirProjetos(App app, Scanner scanner) {
        System.out.println("---- Projetos Cadastrados ----");
        List<InstituicaoPesquisa> instituicoes = app.obterInstituicoes();

        for (int i = 0; i < instituicoes.size(); i++) {
            System.out.println((i + 1) + ". " + instituicoes.get(i).getNome());
        }

        System.out.print("Selecione o número da instituição: ");
        int opcaoInstituicao = scanner.nextInt();
        scanner.nextLine();

        if (opcaoInstituicao < 1 || opcaoInstituicao > instituicoes.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        InstituicaoPesquisa instituicao = instituicoes.get(opcaoInstituicao - 1);
        List<Projeto> projetos = instituicao.obterProjetos();

        if (projetos.isEmpty()) {
            System.out.println("Nenhum projeto cadastrado.");
        } else {
            for (Projeto projeto : projetos) {
                System.out.println("Código: " + projeto.getCodigoProjeto());
                System.out.println("Nome: " + projeto.getNome());
                System.out.println("Descrição: " + projeto.getDescricao());
                System.out.println("Itens Necessários: " + projeto.getItensNecessarios());
                System.out.println();
            }
        }
    }


}

