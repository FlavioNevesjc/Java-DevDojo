package academy.devdojo.maratona.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/flavio");
        Path clazz = Paths.get("/home/flavio/devdojo/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/flavio");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/flavio/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.000ws");

        System.out.println("Exemplo 1: cd "+absoluto1.relativize(absoluto3));
        System.out.println("Exemplo 2: cd "+absoluto2.relativize(absoluto3));
        System.out.println("Exemplo 3: cd "+absoluto3.relativize(absoluto3));
        System.out.println("Exemplo 4: cd "+relativo1.relativize(relativo2));
        System.out.println("Exemplo 5: cd "+relativo1.relativize(absoluto3));



    }
}

