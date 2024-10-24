package datastructures.devsuperior.string.exercises;

import java.util.Scanner;

public class ProblemaAnagrama {
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

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // Incrementa contagem para 's'
            count[t.charAt(i) - 'a']--;  // Decrementa contagem para 't'
        }

        for (int c : count) {
            if (c != 0) {
                return false;  // Se qualquer contagem for diferente de zero, não é anagrama
            }
        }

        return true;
    }
}
