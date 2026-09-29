package com.aaes.bridge;

/**
 * Implementador do padrão Bridge: define como um comunicado será enviado.
 */
public interface CanalComunicacao {

    String enviar(String sindicato, String mensagem);
}
