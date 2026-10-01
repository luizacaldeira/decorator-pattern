package org.example;

public class PlanoFibra implements Plano {

    public float valor;

    public PlanoFibra() {
    }

    public PlanoFibra(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return "Fibra";
    }

}
