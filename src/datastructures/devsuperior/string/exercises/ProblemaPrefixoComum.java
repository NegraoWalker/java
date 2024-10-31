package datastructures.devsuperior.string.exercises;

import java.util.Arrays;

public class ProblemaPrefixoComum {
    public static void main(String[] args) {
        System.out.println("\"" + longestCommonPrefix(new String[] { "flower", "flow", "flight" }) + "\"");
        System.out.println("\"" + longestCommonPrefix(new String[] { "dog","racecar","car" }) + "\"");
    }


    public static String longestCommonPrefix(String[] v) {
        if (v == null || v.length == 0) {
            return "";
        }

        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return result.toString();
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }

}


/*
    Ordenar o array;
    Comparar o primeiro item com o último. Pois entre eles já vão estar certos
*/

