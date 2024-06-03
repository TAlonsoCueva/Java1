import java.util.Scanner;

public class Array 
{
public static Boolean Array (int arrayCaracteres[])
{
    for(int i =0;i<arrayCaracteres.length;i++)
    {
        if(arrayCaracteres[i]== 8)
        {
            System.out.println("el numero" + arrayCaracteres[i] +" ha sido encontrado");
        }
        else
        {
          System.out.println("el numero" + arrayCaracteres[i] +"no ha sido encontrado");
        }
    }
}
    public static void main(String[] args) 
    {

        Integer arrayCaracteres[];
        arrayCaracteres = new Integer[5];

         Scanner scanner = new Scanner (System.in);
        arrayCaracteres[0]= scanner.nextInt();
        arrayCaracteres[1]= scanner.nextInt();
        arrayCaracteres[2]= scanner.nextInt();
        arrayCaracteres[3]= scanner.nextInt();
        arrayCaracteres[4]= scanner.nextInt();

        
scanner.close();
    }
    
}
