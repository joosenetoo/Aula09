import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Sorteio sorteio = new Sorteio();
        //sorteio.iniciar();

        int numeroSorteado = (int) (Math.random() * 1001);

        System.out.println(numeroSorteado);
    }
}