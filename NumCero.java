import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumCero 
{

    public static void main(String[] args)
     {
      Scanner scanner = new Scanner (System.in);
      int numeros= scanner.nextInt();
      int promedio=numeros/numeros;
    
    for(int i =0;i<numeros;i++)
    {
       
        if (numeros>0) 
        {
            numeros= scanner.nextInt();
           int suma=numeros+numeros;
            System.out.println(i);
            
        }
        else if (numeros==0) 
        {
            System.out.println(promedio);
        }




    }



     }
    
}
