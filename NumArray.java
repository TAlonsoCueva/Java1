import java.util.Scanner;

public class NumArray 

{
public static void main(String[] args) 
{

        Integer arrayCaracteres[];
        arrayCaracteres = new Integer[5];
        Scanner scanner = new Scanner (System.in);

        
        for(int i =0;i<arrayCaracteres.length;i++)
        {
            arrayCaracteres[i] = scanner.nextInt();
        }
        for(int i =0;i<arrayCaracteres[i];i++)
        { for(int j= i+1;j<arrayCaracteres[i];j++)
            {
                if (arrayCaracteres[j]<arrayCaracteres[i])
                 {
                    int hvalue=arrayCaracteres[i];
                    arrayCaracteres[i] = arrayCaracteres[j];
                    arrayCaracteres[j] = hvalue;
                    
                }
            }

        }
        for(int i =0;i<arrayCaracteres.length;i++)
        {
            System.out.println(arrayCaracteres[i]);
        }
        scanner.close();
   }
}
