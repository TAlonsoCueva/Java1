import java.util.Scanner;

public class alumno {
	public static void main(String args[])
	{
	 Scanner scanner = new Scanner (System.in);
        int notas= scanner.nextInt();

      if(notas>=0 &&notas<=49)
	  {
		  System.out.println("desaprobado");
	  }
	  if(notas>=50 && notas<=69)
	  {
		  System.out.println("aprobado");
	  }
	  if(notas>=70 && notas<=90)
	  {
		  System.out.println("muy bien");
	  }
	  if(notas>=91&& notas<=100)
	  {
		  System.out.println("sobresaliente");
	  }
 
	}
}