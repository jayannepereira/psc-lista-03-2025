import java.util.Scanner;
import java.lang.Math;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      
     System.out.println("Escreva o primeiro número: ");
     int numero1 = scanner.nextInt();
     
     System.out.println("Escreva o segundo número: ");
     int numero2 = scanner.nextInt();
     
     System.out.println("Escreva o terceiro número: ");
     int numero3 = scanner.nextInt();
     
     int maior = Math.max(numero1, Math.max(numero2, numero3));
     int menor = Math.min(numero1, Math.min(numero2, numero3));
     int media = (numero1 + numero2 + numero3) / 3;
     
     System.out.println("O maior número é " + maior);
     System.out.println("O menor número é " + menor);
     System.out.println("A média é " + media);
  }
}