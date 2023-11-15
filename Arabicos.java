import javax.swing.*;
import java.util.Arrays;

public class Arabicos {
    public static String ConversaoDois (int num) {
        if (num >= 4000) {
            JOptionPane.showMessageDialog(null,"Número Inválido");
            System.exit(1);
        } else if (num == 0) {
            JOptionPane.showMessageDialog(null,"Número Inválido");
            System.exit(1);
        }
            String[] ar = new String[21];
            int contador = 0;
            int indice = 0;
            while (num >= 1000 && contador < 3) {
                ar[indice] = "M";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 1000;
            }
            contador = 0;
            while (num >= 900 && contador < 3) {
                ar[indice] = "CM";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 900;
            }
            contador = 0;
            while (num >= 500 && contador < 3) {
                ar[indice] = "D";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 500;
            }
            contador = 0;
            while (num >= 400 && contador < 3) {
                ar[indice] = "CD";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 400;
            }
            contador = 0;
            while (num >= 100 && contador < 3) {
                ar[indice] = "C";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 100;
            }
            contador = 0;
            while (num >= 90 && contador < 3) {
                ar[indice] = "XC";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 90;
            }
            contador = 0;
            while (num >= 50 && contador < 3) {
                ar[indice] = "L";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 50;
            }
            contador = 0;
            while (num >= 40 && contador < 3) {
                ar[indice] = "XL";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 40;
            }
            contador = 0;
            while (num >= 10 && contador < 3) {
                ar[indice] = "X";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 10;
            }
            contador = 0;
            while (num >= 9 && contador < 3) {
                ar[indice] = "IX";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 9;
            }
            ;
            contador = 0;
            while (num >= 5 && contador < 3) {
                ar[indice] = "V";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 5;
            }
            ;
            contador = 0;
            while (num >= 4 && contador < 3) {
                ar[indice] = "IV";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 4;
            }
            ;
            contador = 0;
            while (num >= 1 && contador < 3) {
                ar[indice] = "I";
                indice = indice + 1;
                contador = contador + 1;
                num = num - 1;
            }
            String algarismos = "";
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] != null) {
                    algarismos = algarismos + ar[i];
                }
            }
            return algarismos;
        }

    }

