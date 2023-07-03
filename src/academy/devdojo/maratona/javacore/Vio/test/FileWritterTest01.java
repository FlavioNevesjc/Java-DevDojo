package academy.devdojo.maratona.javacore.Vio.test;
// File
// FileWriter
// FileReader
// BufferWriter
// BufferReader



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Oi... testando... 123\n");
            fw.flush();
            fw.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
