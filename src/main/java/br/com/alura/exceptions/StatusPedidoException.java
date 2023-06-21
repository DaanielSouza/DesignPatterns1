package br.com.alura.exceptions;

import java.io.Serial;

public class StatusPedidoException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = 1L;

  public StatusPedidoException(String mensagem){
    super(mensagem);
  }
}
