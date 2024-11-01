package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class MedidasMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A, B, C, areaQ, areaTri, areaTra;

        System.out.print("Informe a medida A: ");
        A = scanner.nextDouble();
        System.out.print("Informe a medida B: ");
        B = scanner.nextDouble();
        System.out.print("Informe a medida C: ");
        C = scanner.nextDouble();

        areaQ = Math.pow(A,2);
        areaTri = ((A * B) / 2);
        areaTra = (((A + B) * C) / 2);

        System.out.printf("Área Quadrado: %.4f \n", areaQ);
        System.out.printf("Área Triângulo: %.4f \n", areaTri);
        System.out.printf("Área Trapézio: %.4f \n", areaTra);

        scanner.close();
    }
}
