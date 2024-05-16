import java.util.Scanner;

class  Numeros {

  // Si es divisible por 7 Bazzos
  // Dado un text.¿es Palindromo?
      public static void main(String[] args){
      Scanner Scanner = new Scanner (System.in);
      int numeros= Scanner.nextInt();


    for(int i =0;i<=numeros;i++)
    {
      if ( i%15==0)
      {
       System.out.println("FizzBuzz");
      } 
      else if (i%3==0)
      {
        System.out.println("Fizz");
      }
      else if (i%5==0)
      {
        System.out.println("Buzz");
      }
      else if (i%7==0) 
      {
        System.out.println("Bazzos");
      }
      else if (i%105 ==0) 
      {
        System.out.println("FizzBuzzBazzos");
      }
      else
      {
        System.out.println(i);
      }
      if (i!= numeros) System.out.println(" ");
    }
    Scanner.close();
  }


    
}