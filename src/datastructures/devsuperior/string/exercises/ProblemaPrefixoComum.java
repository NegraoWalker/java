package datastructures.devsuperior.string.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemaPrefixoComum {
    public static void main(String[] args) {

    }



    public static String longestCommonPrefix(String[] v) {

        Arrays.sort(v);
        String[] firstElement = new String[]{v[0]};
        String[] lastElement = new String[]{v[v.length - 1]};
        String[] result = new String[]{};

        for (int i = 0; i < Math.min(firstElement.length, lastElement.length); i++) {
            if (firstElement[i] != lastElement[i]) {

            }
        }


    }
}


/*
    Ordenar o array;
    Comparar o primeiro item com o último. Pois entre eles já vão estar certos
*/

