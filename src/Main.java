import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List ;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OpcoesMenu opcoesMenu = new OpcoesMenu();
        Scanner entrada = new Scanner(System.in);
        List<String> numeros = new ArrayList<>();
        numeros.add(0, "12");
        numeros.add(1,"34");
        numeros.add(2,"44");
        numeros.add(3, "6");
        numeros.add(4, "98");
        numeros.add(5, "10");
        numeros.add(6, "0");
        numeros.add(7, "35");
        numeros.add(8, "99");
        numeros.add(9,"125");

        opcoesMenu.menu(entrada, numeros);

    }
}
