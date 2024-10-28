package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class TrocoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double precoUnitario, dinheiroRecebido, troco;
        int qtdComprada;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        qtdComprada = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = scanner.nextDouble();

        troco = dinheiroRecebido - (precoUnitario * qtdComprada);
        System.out.printf("Troco: R$ %.2f", troco);

        scanner.close();
    }
}
