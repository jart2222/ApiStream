package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
       long count=Stream.of("Pato Guzman","Paco Gonzalez","Pepa Gutierrez","Pepe Mena",
                        "")
                .filter(String::isEmpty)
                .peek(System.out::println)
               .count();

        System.out.println("count = " + count);
    }
}
