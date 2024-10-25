package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Locale;
import java.util.Scanner;

public class IdadesMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nomePrimeiraPessoa, nomeSegundaPessoa;
        int idadePrimeiraPessoa, idadeSegundaPessoa;
        double mediaIdades;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        nomePrimeiraPessoa = scanner.nextLine();
        System.out.print("Idade: ");
        idadePrimeiraPessoa = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        nomeSegundaPessoa = scanner.nextLine();
        System.out.print("Idade: ");
        idadeSegundaPessoa = scanner.nextInt();

        mediaIdades = (double) (idadePrimeiraPessoa + idadeSegundaPessoa) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nomePrimeiraPessoa, nomeSegundaPessoa, mediaIdades);

        scanner.close();
    }
}
