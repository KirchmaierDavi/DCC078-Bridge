package com.aaes.bridge;

public class EmailComunicacao implements CanalComunicacao {

    @Override
    public String enviar(String sindicato, String mensagem) {
        return "E-mail enviado pelo " + sindicato + ": " + mensagem;
    }
}
