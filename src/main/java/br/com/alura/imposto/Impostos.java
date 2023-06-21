package br.com.alura.imposto;

import java.math.BigDecimal;

public enum Impostos {
  ICMS {
    @Override
    public BigDecimal retornaValorImposto() {
      return new BigDecimal("0.1");
    }
  }, ISS {
    @Override
    public BigDecimal retornaValorImposto() {
      return new BigDecimal("0.02");
    }
  }, PIS {
    @Override
    public BigDecimal retornaValorImposto() {
      return new BigDecimal("0.095");
    }
  }, COFINS {
    @Override
    public BigDecimal retornaValorImposto() {
      return new BigDecimal("0.05");
    }
  };

  public abstract BigDecimal retornaValorImposto();
}
