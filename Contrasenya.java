import java.util.Scanner;

public class Contrasenya 


{

     public static void main(String[] args)
     {
      Scanner scanner = new Scanner (System.in);
      System.out.println("Introduce una contraseña");
      String password = scanner.next();
      password ="Alfagol23";

     for(int i =0;i<password.length();i++)
     {
    
     else if (password.length()<9)
     {
        System.out.println("Debe tener almenos 9 caracteres");
     }
     else if (password != "alfagol23") 
     {
       System.out.println("Tiene que empezar por Mayuscula");
     }

     }

     }
     
    
}
