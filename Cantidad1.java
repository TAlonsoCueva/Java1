import java.util.Scanner;

public class Cantidad1 
{
    public static void main(String[] args) 
    {
       
        int n =20 ;
        System.out.println(countDigitOne(n));
    }

    public static int countDigitOne(int n) {
        int count = 0;
        int i = 1;

        while (i <= n) {
            int divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
            i *= 10;
        }

        return count;
    }
}
