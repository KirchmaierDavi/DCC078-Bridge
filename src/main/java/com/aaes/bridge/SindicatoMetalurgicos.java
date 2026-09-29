package com.aaes.bridge;

public class SindicatoMetalurgicos extends Sindicato {

    public SindicatoMetalurgicos(CanalComunicacao canalComunicacao) {
        super(canalComunicacao);
    }

    @Override
    public String nome() {
        return "Sindicato dos Metalúrgicos";
    }
}
