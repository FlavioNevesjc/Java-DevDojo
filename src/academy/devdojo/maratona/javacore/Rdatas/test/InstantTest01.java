package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); // com Zulo Time (seria uma horario militar ou padrão para o mundo todo)
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); //999.999.999

        System.out.println(LocalDateTime.now()); // UTC
    }
}
