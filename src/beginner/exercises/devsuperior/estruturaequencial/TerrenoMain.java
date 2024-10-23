package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class TerrenoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.print("Digite a largura do terreno: ");
        largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        comprimento = scanner.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        metroQuadrado = scanner.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Area do terreno: %.2f", area);
        System.out.println();
        System.out.printf("Preco do terreno: %.2f", preco);

        scanner.close();
    }
}
