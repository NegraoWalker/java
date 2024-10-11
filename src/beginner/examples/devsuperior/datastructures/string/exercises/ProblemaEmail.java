package beginner.examples.devsuperior.datastructures.string.exercises;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemaEmail {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrada: ");
        String email = scanner.nextLine();

        extractEmailInformation(email);

        scanner.close();
    }

    public static void extractEmailInformation(String email) {
        String regex = "^([\\w._%+-]+)@([\\w.-]+\\.(\\w+))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            String username = matcher.group(1);
            String domain = matcher.group(2);
            String tld = matcher.group(3);

            boolean isBrDomain = tld.equalsIgnoreCase("br");
            String brasileiro = isBrDomain ? "sim" : "não";

            System.out.println("Saída:");
            System.out.println("Usuário: " + username);
            System.out.println("Dominio: " + domain);
            System.out.println("Brasileiro: " + brasileiro);
        }
    }
}
