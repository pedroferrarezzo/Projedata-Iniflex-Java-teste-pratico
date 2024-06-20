package br.com.iniflex.service;

import br.com.iniflex.model.Funcionario;

import java.util.ArrayList;

public interface IFuncionarioService {

    // Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
    public ArrayList<Funcionario> gerarFuncionariosMockados();

    // Remover o funcionário “João” da lista.
    public void removerFuncionarioDaListaPorNome(ArrayList<Funcionario> funcionarios, String nome);

    /*
    Imprimir todos os funcionários com todas as suas informações, sendo que:
        - informação de data deve ser exibido no formato dd/mm/aaaa;
        - informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
    */
    public void exibirInformacoesUsuariosFormatados(ArrayList<Funcionario> funcionarios);

    // Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
    public void atualizarValorSalarioFuncionarios(ArrayList<Funcionario> funcionarios, Integer taxa);

    // Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
    public void exibirMapListaDeFuncionariosAgrupadosPorFuncao(ArrayList<Funcionario> funcionarios);

    // Imprimir os funcionários, agrupados por função.
    public void exibirFuncionariosAgrupadosPorFuncao(ArrayList<Funcionario> funcionarios);

    // Imprimir os funcionários que fazem aniversário no mês 10 e 12.
    public void exibirFuncionariosAniversariantesOutubroEDezembro(ArrayList<Funcionario> funcionarios);

    // Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
    public void exibirFuncionarioMaisVelho(ArrayList<Funcionario> funcionarios);

    // Imprimir a lista de funcionários por ordem alfabética.
    public void exibirFuncionariosPorOrdemAlfabetica(ArrayList<Funcionario> funcionarios);

    // Imprimir o total dos salários dos funcionários.
    public void exibirTotalSalariosFuncionarios(ArrayList<Funcionario> funcionarios);

    // Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
    public void exibirQtdSalariosMinimosPorFuncionario(ArrayList<Funcionario> funcionarios);


}
