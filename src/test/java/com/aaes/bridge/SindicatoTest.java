package com.aaes.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SindicatoTest {

    @Test
    void sindicatoMetalurgicosPodeUsarEmail() {
        Sindicato sindicato = new SindicatoMetalurgicos(new EmailComunicacao());

        assertEquals(
                "E-mail enviado pelo Sindicato dos Metalúrgicos: A pauta foi aprovada.",
                sindicato.enviarComunicado("A pauta foi aprovada.")
        );
    }

    @Test
    void sindicatoProfessoresPodeUsarWhatsApp() {
        Sindicato sindicato = new SindicatoProfessores(new WhatsAppComunicacao());

        assertEquals(
                "WhatsApp enviado pelo Sindicato dos Professores: Greve marcada para sexta-feira.",
                sindicato.enviarComunicado("Greve marcada para sexta-feira.")
        );
    }

    @Test
    void abstracaoPodeSerCombinadaComOutroCanal() {
        Sindicato sindicato = new SindicatoMetalurgicos(new WhatsAppComunicacao());

        assertEquals(
                "WhatsApp enviado pelo Sindicato dos Metalúrgicos: Novo acordo coletivo disponível.",
                sindicato.enviarComunicado("Novo acordo coletivo disponível.")
        );
    }

    @Test
    void naoDeveAceitarMensagemVazia() {
        Sindicato sindicato = new SindicatoProfessores(new EmailComunicacao());

        assertThrows(IllegalArgumentException.class, () -> sindicato.enviarComunicado(" "));
    }

    @Test
    void naoDeveAceitarCanalNulo() {
        assertThrows(IllegalArgumentException.class, () -> new SindicatoMetalurgicos(null));
    }
}
