package com.aaes.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailComunicacaoTest {

    @Test
    void deveEnviarComunicadoPorEmail() {
        CanalComunicacao canal = new EmailComunicacao();

        String resultado = canal.enviar("Sindicato dos Metalúrgicos", "Assembleia amanhã às 18h.");

        assertEquals(
                "E-mail enviado pelo Sindicato dos Metalúrgicos: Assembleia amanhã às 18h.",
                resultado
        );
    }
}
