package br.com.iniflex.repository;

import br.com.iniflex.model.Funcionario;
import br.com.iniflex.model.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioRepository implements IFuncionarioRepository{
    @Override
    public ArrayList<Funcionario> gerarFuncionariosMockados() {
        ArrayList<Funcionario> listaDeFuncionariosMockados = new ArrayList<>();
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("2009.44"), "Operador", "Maria", LocalDate.of(2000, 10, 18)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("2284.38"), "Operador", "João", LocalDate.of(1990, 5, 12)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("9836.14"), "Coordenador", "Caio", LocalDate.of(1961, 5, 2)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("19119.88"), "Diretor", "Miguel", LocalDate.of(1988, 10, 14)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("2234.68"), "Recepcionista", "Alice", LocalDate.of(1995, 1, 5)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("1582.72"), "Operador", "Heitor", LocalDate.of(1999, 11, 19)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("4071.84"), "Contador", "Arthur", LocalDate.of(1993, 3, 31)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("3017.45"), "Gerente", "Laura", LocalDate.of(1994, 7, 8)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("1606.85"), "Eletricista", "Heloísa", LocalDate.of(2003, 5, 24)));
        listaDeFuncionariosMockados.add(new Funcionario(new BigDecimal("2799.93"), "Gerente", "Helena", LocalDate.of(1996, 9, 2)));
        return listaDeFuncionariosMockados;
    }
}
