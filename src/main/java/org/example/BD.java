package org.example;


import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Desenvolvedor> desenvolvedor = new HashMap<>();

    public static Desenvolvedor getDesenvolvedor(Integer matricula) {
        return desenvolvedor.get(matricula);
    }

    public static void addDesenvolvedor(Desenvolvedor desenvolvedor) {
        desenvolvedor.put(desenvolvedor.getMatricula(), desenvolvedor);
    }
}