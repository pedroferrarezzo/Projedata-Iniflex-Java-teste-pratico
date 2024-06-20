package br.com.iniflex.model;

import br.com.iniflex.utils.IFormataData;
import br.com.iniflex.utils.IFormataNumero;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(){
        super();
    };

    public Funcionario(BigDecimal salario, String funcao, String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "nome = " + super.getNome() +
                ", dataNascimento = " + IFormataData.retornaDataEmStringFormatoDdMmAaaa(super.getDataNascimento()) +
                ", salario = " + IFormataNumero.retornaSalarioFormatadoPontoMilharVirgulaDecimal(salario) +
                ", funcao = " + funcao +
                '}';
    }
}
