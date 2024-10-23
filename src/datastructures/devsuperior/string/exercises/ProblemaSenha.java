package datastructures.devsuperior.string.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSenha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrada");
        System.out.print("Senha: ");
        String password = scanner.nextLine();
        System.out.print("Saída: ");
        validatePassword(password);


        scanner.close();
    }

    public static void validatePassword(String password) {
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#&])[A-Za-z\\d@#&]{8,}$";
        if (password.matches(regex)) {
            System.out.println("VÁLIDA");;
        } else {
            System.out.println("INVÁLIDA");
        }
    }
}
