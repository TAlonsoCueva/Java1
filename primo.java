import java.util.Scanner;

class Primo {
  public static void main(String[] args){
    Scanner Scanner = new Scanner (System.in);
    int num= Scanner.nextInt();
    boolean hasDivider = false;
    for(int i = 2;i<=num;i++)
    {
      if (num%i==0 && i != num)
      {
        hasDivider=true;
          
      }  
    }
    if(hasDivider)
      {
        System.out.print("No es un numero primo");
      }
      else{
        System.out.println("Es un numero Primo");
      }
    }
}