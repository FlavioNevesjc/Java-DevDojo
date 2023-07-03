package academy.devdojo.maratona.javacore.Xserializacao.test;

import academy.devdojo.maratona.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratona.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerilizacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Flávio Neves", "121212");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar(aluno);
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/Aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar(Aluno aluno) {
        Path path = Paths.get("pasta/Aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
