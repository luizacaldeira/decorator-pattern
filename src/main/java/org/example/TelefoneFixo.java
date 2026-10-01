package org.example;

public class TelefoneFixo extends PlanoDecorator {

    public TelefoneFixo(Plano plano) {
        super(plano);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Telefone Fixo";
    }
}