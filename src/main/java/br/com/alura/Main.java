package br.com.alura;

import br.com.alura.descontos.CalcDescontos;
import br.com.alura.imposto.CalcImpostos;
import br.com.alura.imposto.Impostos;
import br.com.alura.loja.Orcamento;
import br.com.alura.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal(300), 20);
    Orcamento orcamento2 = new Orcamento(new BigDecimal(600), 1);
    orcamento.aprovar();
    orcamento.aprovar();

    Pedido pedido = new Pedido("Teste", LocalDateTime.now(), orcamento);
    CalcImpostos impostos = new CalcImpostos();
    CalcDescontos descontos = new CalcDescontos();

    System.out.println(impostos.calcular(orcamento, Impostos.ICMS));
    System.out.println(descontos.calcular(orcamento));
    System.out.println(descontos.calcular(orcamento2));
  }
}