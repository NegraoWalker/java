package beginner.examples.devsuperior.datastructures.string.exercises;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemaData1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrada: ");
        String date = scanner.nextLine();

        extractDateData(date);


        scanner.close();
    }

    public static void extractDateData(String date) {
        String regex = "(\\d{1,2})/(\\d{1,2})/(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            // Extrair dia, mês e ano
            String dia = matcher.group(1);
            String mes = matcher.group(2);
            String ano = matcher.group(3);
            // Exibir os resultados
            System.out.println("Dia: " + dia);
            System.out.println("Mês: " + mes);
            System.out.println("Ano: " + ano);
        }
    }
}
