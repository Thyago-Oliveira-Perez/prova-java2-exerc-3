import java.util.List;
import java.util.Scanner;

public class OpcoesMenu {

    public void menu(Scanner entrada, List<String> numeros){
        System.out.println("1 - LISTAR\n2 - MÉDIA\n3 - MAIOR E MENOR\n0 - SAIR");
        String escolha = entrada.next();

        if(isNumeric(escolha)){
            int escolhaInt = Integer.parseInt(escolha);
            switch (escolhaInt){
                case 1:
                    mostrarValores(numeros);
                    menu(entrada, numeros);
                    break;

                case 2:
                    mediaDeNumeros(numeros);
                    menu(entrada, numeros);
                    break;
                case 3:
                    maiorEMenor(numeros);
                    menu(entrada, numeros);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }else{
            System.out.println("Digite um valor válido");
            menu(entrada, numeros);
        }
    }

    public void mostrarValores(List<String> numeros){
        System.out.println("Numeros da Lista");
        for(int i = 0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
    }

    public void mediaDeNumeros(List<String> numeros){

        int media = 0;

        for(int i = 0; i < numeros.size(); i++){

            media += Integer.parseInt(numeros.get(i));

        }
        media = media / numeros.size();

        System.out.println(media);

    }

    public void maiorEMenor(List<String> numeros){

        int maior = 0;
        int menor = 0;
        for(int i = 0; i<numeros.size();i++){
            int j = i+1;
            if(j < numeros.size()){
                if(Integer.parseInt(numeros.get(i)) < Integer.parseInt(numeros.get(j))){
                    maior = Integer.parseInt(numeros.get(j));
                }
                if(Integer.parseInt(numeros.get(i)) > Integer.parseInt(numeros.get(j))){
                    menor = Integer.parseInt(numeros.get(j));
                }
            }
        }

        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
