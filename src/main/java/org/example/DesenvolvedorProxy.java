package org.example;

import java.util.List;

public class DesenvolvedorProxy implements IDesenvolvedor {

    private Desenvolvedor desenvolvedor;

    private Integer matricula;

    public DesenvolvedorProxy(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.desenvolvedor == null) {
            this.desenvolvedor = new Desenvolvedor(this.matricula);
        }
        return this.desenvolvedor.obterDadosPessoais();
    }

    @Override
    public List<Float> obterNotas(Gestor gestor) {
        if (!gestor.isGestor()) {
            throw new IllegalArgumentException("Gestor não autorizado");
        }
        if (this.desenvolvedor == null) {
            this.desenvolvedor = new Desenvolvedor(this.matricula);
        }
        return this.desenvolvedor.obterNotas(gestor);
    }
}