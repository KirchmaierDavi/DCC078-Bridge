package com.aaes.bridge;

public class WhatsAppComunicacao implements CanalComunicacao {

    @Override
    public String enviar(String sindicato, String mensagem) {
        return "WhatsApp enviado pelo " + sindicato + ": " + mensagem;
    }
}
