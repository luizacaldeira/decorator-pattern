package org.example;

public class SegurancaDigital extends PlanoDecorator {

    public SegurancaDigital(Plano plano) {
        super(plano);
    }

    public float getPercentualValor() {
        return 15.0f;
    }

    public String getNomeAdicional() {
        return "Segurança Digital";
    }
}
