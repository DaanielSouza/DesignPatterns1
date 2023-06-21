package br.com.alura.pedido;

import br.com.alura.loja.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Pedido {
  private String cliente;
  private LocalDateTime dataPedido;
  private Orcamento orcamento;
}
