package academy.devdojo.maratona.introducao;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        int num = 7;
        switch (num) {
            default:
                System.out.println("Opção Invalida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
            char sexo = 'M';

            switch (sexo){
                case 'M':
                    System.out.println("Macho");
                    break;
                case 'F':
                    System.out.println("Femea");
                    break;
                default:
                    System.out.println("Não definido");
                    break;
            }

        }
    }
