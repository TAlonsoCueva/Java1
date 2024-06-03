import java.util.Scanner;

public class Meses 
{

    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner (System.in);
         System.out.println("solicite un número entero entre uno y doce");
         int number= scanner.nextInt();

        for (int i =0;i<number;i++)
        {
            if (number==1)
            {
                System.out.println("31");
                
            }
            else if (number==2)
            {
                System.out.println("28");
                
            }
           else if (number==3)
            {
                System.out.println("31");
                
            }
            else if (number==4 || number==6 || number==9 || number==11)
            {
                System.out.println("30");
                
            }
            else 
            {
                System.out.println("31");
            }

 
        }

        
    }
    
}
