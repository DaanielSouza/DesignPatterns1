package br.com.alura.loja;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Orcamento {
  private BigDecimal valor;
  private int qtdItens;
  private StatusPedido situacao;

  public Orcamento(BigDecimal valor, int qtdItens) {
    this.valor = valor;
    this.qtdItens = qtdItens;
    this.situacao = StatusPedido.EM_ANALISE;
  }

  public BigDecimal aplicarDescontoExtra() {
    return this.situacao.valor;
  }

  public void aprovar() {
    this.situacao = situacao.aprovar();
  }

  public void recusar() {
    this.situacao = situacao.recusar();
  }
}
