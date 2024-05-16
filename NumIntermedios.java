import java.util.Scanner;

public class NumIntermedios {
   private static void funcion(int numero1, int numero2) {
      for (int i = numero1 + 1; i < numero2; i++) {
         System.out.print(i);
         if (i != numero2 - 1) {
            System.out.print(",");
         }
      }
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numero1 = scanner.nextInt();
      int numero2 = scanner.nextInt();

      funcion(numero1, numero2);

      scanner.close();
   }

}
