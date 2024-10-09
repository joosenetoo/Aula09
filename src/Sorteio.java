import java.util.Scanner;

public class Sorteio {
    private int numeroSorteado;
    private int tentativas;

    public Sorteio() {
        // Sorteia um número entre 0 e 1000
        numeroSorteado = (int) (Math.random() * 1001);
        tentativas = 0;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int palpite = -1;

        // Continua pedindo palpites até que o usuário acerte o número sorteado
        while (palpite != numeroSorteado) {
            System.out.print("Digite seu palpite (0 a 1000): ");
            palpite = scanner.nextInt();
            tentativas++;

            // Verifica se o palpite é maior ou menor que o número sorteado
            if (palpite > numeroSorteado) {
                System.out.println("Seu palpite é maior que o número sorteado.");
            } else if (palpite < numeroSorteado) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            }
        }

        // Quando o usuário acerta, exibe o número de tentativas
        System.out.println("Parabéns! Você acertou o número sorteado.");
        System.out.println("Você precisou de " + tentativas + " tentativas.");
    }
}
