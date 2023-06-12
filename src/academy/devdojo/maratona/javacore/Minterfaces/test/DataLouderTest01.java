package academy.devdojo.maratona.javacore.Minterfaces.test;

import academy.devdojo.maratona.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratona.javacore.Minterfaces.dominio.FileLoader;

public class DataLouderTest01 {
    public static void main(String[] args) {
        DataBaseLoader databaseloader = new DataBaseLoader();
        FileLoader fileloader = new FileLoader();
        databaseloader.load();
        fileloader.load();
        databaseloader.remove();
        fileloader.remove();
    }
}
