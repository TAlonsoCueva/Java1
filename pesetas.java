import java.util.Scanner;

public class pesetas {
    
    float euros=0.006f;
    float pesetas=1;
    float conversion=(euros)/pesetas;
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner (System.in);
      int Euros= scanner.nextInt();

     System.out.println(Euros);

}


}
