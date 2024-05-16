import java.util.Scanner;

public class Adivina 
{
     public static void main(String[] args)
     {
      Scanner Scanner = new Scanner (System.in);
      int numeros= Scanner.nextInt();
      int adivina=Scanner.nextInt();


      int contadorDemasiadoBjo=0;
      int contadorDemasiadoAlto=0;
      int intentos=5;
    for(int i =0;i<numeros;i++)
    {
        if (numeros>adivina) 
        {
             System.out.println("Demasiado bajo");
            System.out.println(numeros);
             contadorDemasiadoBjo++;
             intentos--;
             adivina=Scanner.nextInt();
          
            
        }else if (numeros<adivina) 
        {
           System.out.println("Demasiado grande");
           System.out.println(numeros);
           contadorDemasiadoAlto++;
            intentos--;
            adivina=Scanner.nextInt();
        }
        else 
        {
           System.out.println("Lo has encontrado");
           System.out.println("intentos: " + intentos);
           System.out.println("Demasiado bajo: " + contadorDemasiadoBjo);
           System.out.println("Demasiado alto: " + contadorDemasiadoAlto);
           return;
            
        }

    }
     }


    
}
