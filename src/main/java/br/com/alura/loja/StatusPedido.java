package br.com.alura.loja;

import br.com.alura.exceptions.StatusPedidoException;
import br.com.alura.utils.StringUtils;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum StatusPedido {
  APROVADO(new BigDecimal("0.1")) {
    @Override
    protected StatusPedido aprovar() {
      return FINALIZADO;
    }

    @Override
    protected StatusPedido recusar() {
      return RECUSADO;
    }
  },
  EM_ANALISE(new BigDecimal("0.05")) {
    @Override
    protected StatusPedido aprovar() {
      return APROVADO;
    }

    @Override
    protected StatusPedido recusar() {
      return RECUSADO;
    }
  },
  FINALIZADO(BigDecimal.ZERO),
  RECUSADO(BigDecimal.ZERO);

  public final BigDecimal valor;

  protected StatusPedido aprovar() {
    throw new StatusPedidoException(StringUtils.statusAprovar);
  }

  protected StatusPedido recusar() {
    throw new StatusPedidoException(StringUtils.statusRecusado);
  }

  StatusPedido(BigDecimal valor) {
    this.valor = valor;
  }
}
