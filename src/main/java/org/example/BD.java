package org.example;


import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Desenvolvedor> desenvolvedores = new HashMap<>();

    public static Desenvolvedor getDesenvolvedor(Integer matricula) {
        return desenvolvedores.get(matricula);
    }

    public static void addDesenvolvedor(Desenvolvedor desenvolvedor) {
        desenvolvedores.put(desenvolvedor.getMatricula(), desenvolvedor);
    }
}