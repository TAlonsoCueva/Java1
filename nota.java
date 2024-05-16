import java.util.Scanner;

public class nota 
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner (System.in);
        int nota= scanner.nextInt();
  
          if(nota>=100)
          {
              System.out.println("Alta");
          }
          else if( nota<100)
          {
              System.out.println("Baja");
          }
    }
     
}


