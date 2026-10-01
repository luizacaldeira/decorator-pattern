package org.example;

public abstract class PlanoDecorator implements Plano {

    private Plano plano;
    public String descricao;

    public PlanoDecorator(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public abstract float getPercentualValor();

    public float getValor() {
        return this.plano.getValor() * (1 + (this.getPercentualValor() / 100));
    }

    public abstract String getNomeAdicional();

    public String getDescricao() {
        return this.plano.getDescricao() + "/" + this.getNomeAdicional();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}