package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class SomaMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int X, Y, soma;

        System.out.print("Informe o valor de X: ");
        X = scanner.nextInt();

        System.out.print("Informe o valor de Y: ");
        Y = scanner.nextInt();

        soma = X + Y;

        System.out.println("SOMA: " + soma);

        scanner.close();
    }
}
