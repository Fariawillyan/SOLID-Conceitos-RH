package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualAjuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if( percentualAjuste.compareTo(new BigDecimal("0.4")) > 0){
            throw new ValidacaoException("Reajuste nao pode ser superiro a 40% salario");
        }

    }

}
