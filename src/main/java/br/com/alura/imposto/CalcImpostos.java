package br.com.alura.imposto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class CalcImpostos {
  public BigDecimal calcular(Orcamento orcamento, Impostos impostos) {
    return orcamento.getValor().multiply(impostos.retornaValorImposto());
  }
}
