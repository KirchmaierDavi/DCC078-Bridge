package com.aaes.bridge;

/**
 * Abstração do Bridge. O sindicato pode trocar o canal sem alterar sua regra.
 */
public abstract class Sindicato {

    private final CanalComunicacao canalComunicacao;

    protected Sindicato(CanalComunicacao canalComunicacao) {
        if (canalComunicacao == null) {
            throw new IllegalArgumentException("O canal de comunicação é obrigatório");
        }
        this.canalComunicacao = canalComunicacao;
    }

    public String enviarComunicado(String mensagem) {
        if (mensagem == null || mensagem.isBlank()) {
            throw new IllegalArgumentException("A mensagem não pode ser vazia");
        }
        return canalComunicacao.enviar(nome(), mensagem);
    }

    public abstract String nome();
}
