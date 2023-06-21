package br.com.alura.descontos;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class CalcDescontos {
  public BigDecimal calcular(Orcamento orcamento) {
    return Descontos.retornaDesconto(orcamento);
  }
}
