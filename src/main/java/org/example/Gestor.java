package org.example;

public class Gestor {
    private String nome;
    private boolean gestor;

    public Gestor(String nome, boolean gestor) {
        this.nome = nome;
        this.gestor = gestor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGestor() {
        return gestor;
    }

    public void setGestor(boolean administrador) {
        this.gestor = administrador;
    }
}