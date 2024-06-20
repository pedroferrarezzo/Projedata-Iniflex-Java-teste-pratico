package br.com.iniflex.service;

import br.com.iniflex.model.Funcionario;
import br.com.iniflex.repository.FuncionarioRepository;
import br.com.iniflex.repository.IFuncionarioRepository;
import br.com.iniflex.utils.IFormataNumero;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class FuncionarioService implements IFuncionarioService {

    @Override
    public ArrayList<Funcionario> gerarFuncionariosMockados() {
        IFuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        return funcionarioRepository.gerarFuncionariosMockados();
    }

    @Override
    public void removerFuncionarioDaListaPorNome(ArrayList<Funcionario> funcionarios, String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }

    @Override
    public void exibirInformacoesUsuariosFormatados(ArrayList<Funcionario> funcionarios) {
        funcionarios.forEach(funcionario -> {
            System.out.println(funcionario.toString());
        });

    }

    @Override
    public void atualizarValorSalarioFuncionarios(ArrayList<Funcionario> funcionarios, Integer taxa) {
        BigDecimal percentual = new BigDecimal(taxa).divide(new BigDecimal(100));

        funcionarios.forEach(funcionario -> {
            BigDecimal novoSalarioFuncionario = funcionario.getSalario().multiply(percentual).add(funcionario.getSalario());
            funcionario.setSalario(novoSalarioFuncionario);
        });
    }

    @Override
    public void exibirMapListaDeFuncionariosAgrupadosPorFuncao(ArrayList<Funcionario> funcionarios) {
        Map<String, List<Funcionario>> funcionariosHashMap = new HashMap<String, List<Funcionario>>();
        HashSet<String> funcoesHashSet = new HashSet<String>();

        funcionarios.forEach(funcionario -> {
            funcoesHashSet.add(funcionario.getFuncao());
        });

        funcoesHashSet.forEach(funcao -> {
            List<Funcionario> funcionariosFilterListFuncao = funcionarios.stream().filter(funcionario -> {
                return funcionario.getFuncao().equalsIgnoreCase(funcao);
            }).toList();

            funcionariosHashMap.put(funcao, funcionariosFilterListFuncao);
        });

        System.out.println(
                funcionariosHashMap
        );
    }

    @Override
    public void exibirFuncionariosAgrupadosPorFuncao(ArrayList<Funcionario> funcionarios) {
        HashSet<String> funcoesHashSet = new HashSet<String>();
        ArrayList<List<Funcionario>> funcionarioAgrupadoPorFuncaoArrayList = new ArrayList<>();

        funcionarios.forEach(funcionario -> {
            funcoesHashSet.add(funcionario.getFuncao());
        });

        funcoesHashSet.forEach(funcao -> {

            List<Funcionario> funcionariosFilterListFuncao = funcionarios.stream().filter(funcionario -> {
                return funcionario.getFuncao().equalsIgnoreCase(funcao);
            }).toList();

            funcionarioAgrupadoPorFuncaoArrayList.add(funcionariosFilterListFuncao);

        });

        System.out.println(funcionarioAgrupadoPorFuncaoArrayList);

    }

    @Override
    public void exibirFuncionariosAniversariantesOutubroEDezembro(ArrayList<Funcionario> funcionarios) {
        System.out.println(
                funcionarios.stream().filter(
                        funcionario -> {
                            return funcionario.getDataNascimento().getMonthValue() == 10 || funcionario.getDataNascimento().getMonthValue() == 12;
                        }
                ).collect(Collectors.toList())
        );
    }

    @Override
    public void exibirFuncionarioMaisVelho(ArrayList<Funcionario> funcionarios) {
        Funcionario funcionarioMaisVelho = new Funcionario();
        funcionarioMaisVelho.setDataNascimento(LocalDate.now());

        funcionarios.forEach(funcionario -> {
            if (Period.between(funcionario.getDataNascimento(), LocalDate.now()).getYears() > Period.between(funcionarioMaisVelho.getDataNascimento(), LocalDate.now()).getYears()) {
                funcionarioMaisVelho.setNome(funcionario.getNome());
                funcionarioMaisVelho.setDataNascimento(funcionario.getDataNascimento());
            }
        });

        System.out.printf("Nome: %s | Idade: %d \n", funcionarioMaisVelho.getNome(), Period.between(funcionarioMaisVelho.getDataNascimento(), LocalDate.now()).getYears());
    }

    @Override
    public void exibirFuncionariosPorOrdemAlfabetica(ArrayList<Funcionario> funcionarios) {
        funcionarios.sort(new Comparator<Funcionario>() {
                              @Override
                              public int compare(Funcionario o1, Funcionario o2) {
                                  return o1.getNome().compareTo(o2.getNome());
                              }
                          }
        );

        System.out.println(funcionarios);


    }

    @Override
    public void exibirTotalSalariosFuncionarios(ArrayList<Funcionario> funcionarios) {
        List<BigDecimal> salariosDosFuncionarios = funcionarios.stream().map(Funcionario::getSalario).toList();
        Optional<BigDecimal> totalSalarioDosFuncionarios = salariosDosFuncionarios.stream().reduce(
                BigDecimal::add);

        if (totalSalarioDosFuncionarios.isPresent()) System.out.printf("O total do salário dos funcionários é: %s \n", IFormataNumero.retornaSalarioFormatadoPontoMilharVirgulaDecimal(totalSalarioDosFuncionarios.get()));

    }

    @Override
    public void exibirQtdSalariosMinimosPorFuncionario(ArrayList<Funcionario> funcionarios) {
        Map<String, BigDecimal> funcionariosSalariosMinimosHashMap = new HashMap<String,BigDecimal>();

        funcionarios.forEach(funcionario -> {
            funcionariosSalariosMinimosHashMap.put(funcionario.getNome(), funcionario.getSalario().divide(BigDecimal.valueOf(1212.00), 0, RoundingMode.DOWN));
        });

        System.out.println(funcionariosSalariosMinimosHashMap);
    }
}
