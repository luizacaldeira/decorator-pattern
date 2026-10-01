package org.example;

public class BackupNuvem extends PlanoDecorator {

    public BackupNuvem(Plano plano) {
        super(plano);
    }

    public float getPercentualValor() {
        return 5.0f;
    }

    public String getNomeAdicional() {
        return "Backup em Nuvem";
    }
}