package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;


        System.out.print("Base do retangulo: ");
        base = scanner.nextDouble();
        System.out.print("Altura do retangulo: ");
        altura = scanner.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(2, base) + Math.pow(2, altura));

        System.out.printf("Area: %.4f", area);
        System.out.println();
        System.out.printf("Perimetro: %.4f", perimetro);
        System.out.println();
        System.out.printf("Diagonal: %.4f", diagonal);

        scanner.close();
    }
}
