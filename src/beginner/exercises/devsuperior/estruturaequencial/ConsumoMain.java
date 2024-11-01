package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class ConsumoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double distanciaPercorrida, combustivelGasto, consumoMedio;

        System.out.print("Informe a distância total percorrida em Km: ");
        distanciaPercorrida = scanner.nextDouble();
        System.out.print("Informe o total de combustível gasto: ");
        combustivelGasto = scanner.nextDouble();
        consumoMedio = distanciaPercorrida / combustivelGasto;
        System.out.printf("Consumo médio: %.3f", consumoMedio);

        scanner.close();
    }
}
