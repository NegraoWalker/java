package beginner.examples.devsuperior.datastructures.string.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaData2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrada");
        System.out.print("Dia: ");
        int day = scanner.nextInt();
        System.out.print("Mês: ");
        int month = scanner.nextInt();
        System.out.print("Ano: ");
        int year = scanner.nextInt();

        System.out.print("Saída: ");
        formatDate(day, month, year);

        scanner.close();
    }

    public static void formatDate(int day, int month, int year) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        String formattedYear = String.valueOf(year);

        System.out.println(formattedDay + "/" + formattedMonth + "/" + formattedYear);
    }
}
