import java.util.Scanner;

public class Mayornum 
{

     public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();


if(num1>num2)
{ 
    if (num1>num3)
  {
    System.out.println(num1);
  }
}
if(num2>num1)
{if (num2>num3)
{
    System.out.println(num2);
}

}
if(num3>num1)
{if (num3>num2)
{
    System.out.println(num3);
}

}

    }
    
}
