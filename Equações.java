import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Equação de segundo grau: ax^2 + bx + c = 0");
      
     System.out.println("Defina um valor para o coeficiente a: ");
     int a = scanner.nextInt();
     
     System.out.println("Defina um valor para o coeficiente b: ");
     int b = scanner.nextInt();
     
     System.out.println("Defina um valor para o coeficiente c: ");
     int c = scanner.nextInt();
     
     if(a == 0 && b == 0 && c != 0){
        System.out.println("Coeficientes informados incorretamente.");
     }else if(a == 0 && b != 0){
        double raiz = (double) -c / b;
        System.out.println("Essa é uma equação de primeiro grau.");
        System.out.println("A raiz real da equação é " + raiz);
     }else{
        int delta = b * b - 4 * a * c;
         
        if(delta < 0){
        System.out.println("Esta equação não possui raízes reais.");
     }else if(delta == 0){
        double raiz = (double) -b / (2 * a);
        System.out.println("Esta equação possui duas raízes reais iguais.");
        System.out.println("A raiz da equação é " + raiz);
     }else{
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Esta equação possui duas raízes reais diferentes.");
        System.out.println("As raízes da equação são: x1 = " + raiz1 + " e x2 = " + raiz2);
     }
     }
     scanner.close();
     }
}



