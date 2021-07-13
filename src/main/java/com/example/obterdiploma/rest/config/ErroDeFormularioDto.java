package com.example.obterdiploma.rest.config;

public class ErroDeFormularioDto {
    String erro;
    String campo;

    public ErroDeFormularioDto(String erro, String campo) {
        this.erro = erro;
        this.campo = campo;
    }

    public String getErro() {
        return erro;
    }

    public String getCampo() {
        return campo;
    }
}