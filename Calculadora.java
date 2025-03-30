import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Escreva o primeiro número: ");
     double numero1 = scanner.nextDouble();
     
     System.out.println("Escreva o segundo número: ");
     double numero2 = scanner.nextDouble();
     
     System.out.println("Defina o símbolo para a operação: ");
     String operador = scanner.next();
     
     double resultado;
     
     if (operador.equals("+")) {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operador.equals("-")) {
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operador.equals("*")) {
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operador.equals("/")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else if (operador.equals("^")) {
            resultado = Math.pow(numero1, numero2);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Erro: O símbolo da operação é inválido.");
     }
     scanner.close();
    }
 }




