package com.aaes.bridge;

public class SindicatoProfessores extends Sindicato {

    public SindicatoProfessores(CanalComunicacao canalComunicacao) {
        super(canalComunicacao);
    }

    @Override
    public String nome() {
        return "Sindicato dos Professores";
    }
}
