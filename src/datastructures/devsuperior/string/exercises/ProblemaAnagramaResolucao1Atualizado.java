package datastructures.devsuperior.string.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemaAnagramaResolucao1Atualizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s, t;

        System.out.print("Informe a palavra s: ");
        s = scanner.nextLine();
        System.out.print("Informe a palavra t: ");
        t = scanner.nextLine();

        System.out.println(isAnagram(s, t));

        scanner.close();
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrayS = s.toCharArray(); //Transformando a String s em um array de caracteres
        char[] arrayT = t.toCharArray(); //Transformando a String t em um array de caracteres

        Arrays.sort(arrayS); //Ordenando o array s em ordem alfabética
        Arrays.sort(arrayT); //Ordenando o array t em ordem alfabética

        return Arrays.equals(arrayS, arrayT);
    }
}
