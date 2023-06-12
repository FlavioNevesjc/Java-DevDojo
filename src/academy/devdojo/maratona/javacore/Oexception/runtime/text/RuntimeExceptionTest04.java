package academy.devdojo.maratona.javacore.Oexception.runtime.text;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
       try {
           throw  new ArrayIndexOutOfBoundsException();
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Erro dentro de ArrayIndexOutOfBoundsException");
       } catch (IndexOutOfBoundsException e) {
           System.out.println("Erro dentro de IndexOutOfBoundsException");
       } catch (IllegalArgumentException e) {
           System.out.println("Erro dentro de IllegalArgumentException");
       } catch (ArithmeticException e) {
           System.out.println("Erro dentro de ArithmeticException");
       } catch (RuntimeException e) {
           System.out.println("Erro dentro de RuntimeException");
       }

       try {
           talvesLanceException();
       } catch (SQLException | FileNotFoundException e) {
           e.printStackTrace();
       }
    }
    private static void talvesLanceException() throws SQLException, FileNotFoundException {

    }
}
