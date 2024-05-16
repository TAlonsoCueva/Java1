import java.util.Scanner;

public class Descuento 

{
         public static void main(String[] args)
         {
         Scanner scanner= new Scanner (System.in);
         int preciOriginal= scanner.nextInt();
         int precioPagado =scanner.nextInt();


         int SalidaDescuento= preciOriginal-precioPagado;
         int SalidaPrecio= preciOriginal/SalidaDescuento;

         System.out.println(SalidaPrecio);
         System.out.println(SalidaDescuento);
         
         }
}
