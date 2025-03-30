import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Escreva o código da operação: ");
     int numero1 = scanner.nextInt();
     
     System.out.println("Escreva o raio do círculo/esfera: ");
     int numero2 = scanner.nextInt();
     
     if(numero1 == 1){
        double perimetro = 2 * 3.141592 * numero2;
        System.out.println("O perímetro do círculo é igual a " + perimetro);
     }else if(numero1 == 2){
        double area = 3.141592 * (numero2 * numero2);
        System.out.println("A área do círculo é igual a " + area);
     }else if(numero1 == 3){
        double volume = (4.0 / 3.0) * 3.141592 * (numero2 * numero2 * numero2);
        System.out.println("O volume do círculo é igual a " + volume);
     }else{
        System.out.println("O código da operação é inválido.");
     }
     scanner.close();
    }
 }




