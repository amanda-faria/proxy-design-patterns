package org.example;

import java.util.Arrays;
import java.util.List;

    public class Desenvolvedor implements IDesenvolvedor {

        private Integer matricula;
        private String nome;
        private String cidade;
        private Float notaDesempenhoInterno;
        private Float quantidadeTarefasRealizadas;

        public Desenvolvedor(int matricula) {
            this.matricula = matricula;
            Desenvolvedor objeto = BD.getDesenvolvedor(matricula);
            this.nome = objeto.nome;
            this.cidade = objeto.cidade;
            this.notaDesempenhoInterno = objeto.notaDesempenhoInterno;
            this.quantidadeTarefasRealizadas = objeto.quantidadeTarefasRealizadas;
        }

        public Desenvolvedor(Integer matricula, String nome, String cidade, Float notaDesempenhoInterno, Float quantidadeTarefasRealizadas) {
            this.matricula = matricula;
            this.nome = nome;
            this.cidade = cidade;
            this.notaDesempenhoInterno = notaDesempenhoInterno;
            this.quantidadeTarefasRealizadas = quantidadeTarefasRealizadas;
        }

        public Integer getMatricula() {
            return matricula;
        }

        @Override
        public List<String> obterDadosPessoais() {
            return Arrays.asList(this.nome, this.cidade);
        }

        @Override
        public List<Float> obterNotas(Gestor gestor) {
            return Arrays.asList(this.notaDesempenhoInterno, this.quantidadeTarefasRealizadas);
        }


        public void put(Integer matricula, Desenvolvedor desenvolvedor) {
        }
    }
