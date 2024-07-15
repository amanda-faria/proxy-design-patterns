package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class DesenvolvedorProxyTest {

    @BeforeEach
    void setUp() {
        BD.addDesenvolvedor(new Desenvolvedor(1, "João", "Juiz de Fora", 8.0f, 9.0f));
        BD.addDesenvolvedor(new Desenvolvedor(2, "Maria", "Juiz de Fora", 10.0f, 10.0f));
    }

    @Test
    void deveRetornarDadosPessoaisDesenvolvedor() {
        DesenvolvedorProxy desenvolvedor = new DesenvolvedorProxy(1);

        assertEquals(Arrays.asList("João", "Juiz de Fora"), desenvolvedor.obterDadosPessoais());
    }

    @Test
    void deveRetonarDesempenhoDesenvolvedor() {
        Gestor gestor = new Gestor("Ana", true);
        DesenvolvedorProxy desenvolvedor = new DesenvolvedorProxy(2);

        assertEquals(Arrays.asList(10.0f, 10.0f), desenvolvedor.obterNotas(gestor));
    }

    @Test
    void deveRetonarExcecaoGestorNaoAutorizadoConsultarDesempenhoDesenvolvedor() {
        try {
            Gestor gestor = new Gestor("Joana", false);
            DesenvolvedorProxy desenvolvedor = new DesenvolvedorProxy(2);

            desenvolvedor.obterNotas(gestor);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Gestor não autorizado", e.getMessage());
        }
    }

}