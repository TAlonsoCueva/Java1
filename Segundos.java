import java.util.Scanner;

public class Segundos 
{
     public static void main(String[] args)
    {
    

        

        Scanner scanner = new Scanner (System.in);
        int Segundos= scanner.nextInt();

        int horas= Segundos/3600;
        int minutos=Segundos/60;
        
         
        System.out.println(horas +"h");
        System.out.println(minutos-(horas*60)+ "m");
        System.out.println(Segundos-(minutos*60)+ "s");
    }
    
}
