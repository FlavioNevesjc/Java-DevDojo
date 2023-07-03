package academy.devdojo.maratona.javacore.Wnio.test;
// Como se fosse realizar um dir no diretorio para listar todos os arquivos e pasta da mesma (raiz desta pasta)

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path path1: stream) {
                System.out.println(path1.getFileName());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
