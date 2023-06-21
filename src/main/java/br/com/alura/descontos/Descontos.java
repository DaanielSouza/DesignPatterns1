package br.com.alura.descontos;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public enum Descontos {
  QTDMAIORQUE5(new BigDecimal("0.1")) {
    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
      return orcamento.getQtdItens() > 5;
    }
  },
  VALORTOTALMAIOR500(new BigDecimal("0.05")) {
    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
      return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
  };

  public final BigDecimal valor;

  Descontos(BigDecimal valor) {
    this.valor = valor;
  }

  protected abstract boolean deveAplicar(Orcamento orcamento);

  protected static BigDecimal retornaDesconto(Orcamento orcamento) {
    if (QTDMAIORQUE5.deveAplicar(orcamento))
      return orcamento.getValor().multiply(QTDMAIORQUE5.valor);

    if (VALORTOTALMAIOR500.deveAplicar(orcamento))
      return orcamento.getValor().multiply(VALORTOTALMAIOR500.valor);

    return BigDecimal.ZERO;
  }
};
