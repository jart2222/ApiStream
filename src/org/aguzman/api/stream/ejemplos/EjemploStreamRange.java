package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {
        Stream<Integer> nombres = Stream.of(5,10,15,20)
                .distinct();

        int resultado=nombres.reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}
