package br.com.iniflex.repository;

import br.com.iniflex.model.Funcionario;
import br.com.iniflex.model.Pessoa;

import java.util.ArrayList;

public interface IFuncionarioRepository {
    // Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
    public ArrayList<Funcionario> gerarFuncionariosMockados();
}
