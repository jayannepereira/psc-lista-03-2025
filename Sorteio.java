import java.util.Scanner;
import java.util.Random;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        int numero2 = scanner.nextInt();
        
        int maior = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);

        int numeroSorteado = sorteia(menor, maior);

        System.out.println("Número sorteado: " + numeroSorteado);
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        scanner.close();
    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random random = new Random();
        return random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }
}