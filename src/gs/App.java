package gs;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<ProdutorRural> produtores;
    private List<EmpresaTecnologia> empresas;
    private List<InstituicaoPesquisa> instituicoes;

    public App() {
        produtores = new ArrayList<>();
        empresas = new ArrayList<>();
        instituicoes = new ArrayList<>();
    }

    public void adicionarProdutor(ProdutorRural produtor) {
        produtores.add(produtor);
    }

    public void removerProdutor(ProdutorRural produtor) {
        produtores.remove(produtor);
    }

    public List<ProdutorRural> obterProdutores() {
        return produtores;
    }

    public void adicionarEmpresa(EmpresaTecnologia empresa) {
        empresas.add(empresa);
    }

    public void removerEmpresa(EmpresaTecnologia empresa) {
        empresas.remove(empresa);
    }

    public List<EmpresaTecnologia> obterEmpresas() {
        return empresas;
    }

    public void adicionarInstituicao(InstituicaoPesquisa instituicao) {
        instituicoes.add(instituicao);
    }

    public void removerInstituicao(InstituicaoPesquisa instituicao) {
        instituicoes.remove(instituicao);
    }

    public List<InstituicaoPesquisa> obterInstituicoes() {
        return instituicoes;
    }
    
    // for iterando empresa por empresa para buscar pelo cnpj setado
    public EmpresaTecnologia buscarEmpresaPorCnpj(String codigoEmpresa) {
        for (EmpresaTecnologia empresa : empresas) {
            if (empresa.getCodigoEmpresa().equals(codigoEmpresa)) {
                return empresa;
            }
        }
        return null; // Caso não encontre a empresa
    }

}

