package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class CirculoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        double raio, area;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = scanner.nextDouble();

        area = PI * Math.pow(raio, 2);

        System.out.printf("Área do círculo: %.3f", area);

        scanner.close();
    }
}
