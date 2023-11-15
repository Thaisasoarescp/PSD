import java.awt.*;

public class Romanos{
    public static int Conversao(String algarismo) {
        int number = 0;
        switch (algarismo) {
            case "I":
               number = 1;
                break;
            case "V":
                number = 5;
                break;
            case "X":
                number = 10;
                break;
            case "L":
               number = 50;
                break;
            case "C":
                number = 100;
                break;
            case "D":
                number = 500;
                break;
            case "M":
                number = 1000;
                break;
            default:
                System.out.println("Algarismo inválido");
        }
        return number;
    }
}