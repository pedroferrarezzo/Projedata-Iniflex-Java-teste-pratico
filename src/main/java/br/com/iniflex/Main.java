package br.com.iniflex;

import br.com.iniflex.model.Funcionario;
import br.com.iniflex.service.FuncionarioService;
import br.com.iniflex.service.IFuncionarioService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declaracao e inicializacao das varíaveis base
            IFuncionarioService funcionarioService = new FuncionarioService();

            // Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
            ArrayList<Funcionario> funcionariosMockados = funcionarioService.gerarFuncionariosMockados();


        // Execucao dos metodos da Service

            // Remover o funcionário “João” da lista.
            System.out.println("-----------------Remover o funcionário “João” da lista-------------------");

            System.out.printf("Size da lista antes da remoção: %d | Segundo funcionário da lista antes da remoção: %s \n", funcionariosMockados.size(), funcionariosMockados.get(1).getNome());
            funcionarioService.removerFuncionarioDaListaPorNome(funcionariosMockados, "João");
            System.out.printf("Size da lista após remoção: %d | Segundo funcionário da lista após a remoção: %s \n", funcionariosMockados.size(), funcionariosMockados.get(1).getNome());

            System.out.println("--------------------------------------------");

            // Gerando novamente os dados Mock apos a remoção
            funcionariosMockados = funcionarioService.gerarFuncionariosMockados();

            /*
                Imprimir todos os funcionários com todas as suas informações, sendo que:
                    - informação de data deve ser exibido no formato dd/mm/aaaa;
                    - informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
            */
            System.out.println("-----------------Imprimir todos os funcionários com todas as suas informações, sendo que...-------------------");

            funcionarioService.exibirInformacoesUsuariosFormatados(funcionariosMockados);

            System.out.println("--------------------------------------------");


            // Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
            System.out.println("-----------------Os funcionários receberam 10% de aumento de salário, atualizar a lista...-------------------");

            System.out.println("-----------------Salário antes do aumento de 10%-------------------");
            funcionarioService.exibirInformacoesUsuariosFormatados(funcionariosMockados);

            System.out.println("-----------------Salário após o aumento de 10%-------------------");
            funcionarioService.atualizarValorSalarioFuncionarios(funcionariosMockados, 10);
            funcionarioService.exibirInformacoesUsuariosFormatados(funcionariosMockados);

            System.out.println("--------------------------------------------");

            // Gerando novamente os dados Mock apos a atualizacao
            funcionariosMockados = funcionarioService.gerarFuncionariosMockados();

            // Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
            System.out.println("-----------------Agrupar os funcionários por função em um MAP, sendo a chave a “função”...-------------------");
            funcionarioService.exibirMapListaDeFuncionariosAgrupadosPorFuncao(funcionariosMockados);
            System.out.println("--------------------------------------------");


            // Imprimir os funcionários, agrupados por função.
            System.out.println("-----------------Imprimir os funcionários, agrupados por função.-------------------");
            funcionarioService.exibirFuncionariosAgrupadosPorFuncao(funcionariosMockados);
            System.out.println("--------------------------------------------");

            // Imprimir os funcionários que fazem aniversário no mês 10 e 12.
            System.out.println("-----------------Imprimir os funcionários que fazem aniversário no mês 10 e 12.-------------------");
            funcionarioService.exibirFuncionariosAniversariantesOutubroEDezembro(funcionariosMockados);
            System.out.println("--------------------------------------------");

            // Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
            System.out.println("-----------------Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.-------------------");
            funcionarioService.exibirFuncionarioMaisVelho(funcionariosMockados);
            System.out.println("--------------------------------------------");

            // Imprimir a lista de funcionários por ordem alfabética.
            System.out.println("-----------------Imprimir a lista de funcionários por ordem alfabética.-------------------");
            funcionarioService.exibirFuncionariosPorOrdemAlfabetica(funcionariosMockados);
            System.out.println("--------------------------------------------");

            // Imprimir o total dos salários dos funcionários.
            System.out.println("-----------------Imprimir o total dos salários dos funcionários.-------------------");
            funcionarioService.exibirTotalSalariosFuncionarios(funcionariosMockados);
            System.out.println("--------------------------------------------");

            // Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
            System.out.println("-----------------Imprimir quantos salários mínimos ganha cada funcionário, considerando...-------------------");
            funcionarioService.exibirQtdSalariosMinimosPorFuncionario(funcionariosMockados);
            System.out.println("--------------------------------------------");
    }
}