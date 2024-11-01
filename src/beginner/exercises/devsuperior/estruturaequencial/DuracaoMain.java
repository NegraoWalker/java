package beginner.exercises.devsuperior.estruturaequencial;

import java.util.Scanner;

public class DuracaoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duracao;
        System.out.print("Digite a duração em segundos: ");
        duracao = scanner.nextInt();

        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;

        System.out.printf("Duração: %02d:%02d:%02d\n", horas, minutos, segundos);

        scanner.close();
    }
}
