package com.aaes.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhatsAppComunicacaoTest {

    @Test
    void deveEnviarComunicadoPorWhatsApp() {
        CanalComunicacao canal = new WhatsAppComunicacao();

        String resultado = canal.enviar("Sindicato dos Professores", "A reunião foi remarcada.");

        assertEquals(
                "WhatsApp enviado pelo Sindicato dos Professores: A reunião foi remarcada.",
                resultado
        );
    }
}
