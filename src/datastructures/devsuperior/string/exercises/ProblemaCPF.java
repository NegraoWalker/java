package datastructures.devsuperior.string.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCPF {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrada: ");
        String cpf = scanner.nextLine();

        System.out.println("Saida: " + removeNonDigits(cpf));

        scanner.close();
    }

    public static String removeNonDigits(String str) {
        return str.replaceAll("\\D", "");
    }
}
