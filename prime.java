
import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        System.out.println("Podaj Liczbę: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(getPrime(number) == 1)
        {
            //Liczba złożona
            System.out.println("Liczba złożona");
        }
        else if(getPrime(number) == 2)
        {
            //Liczba pierwsza
            System.out.println("Liczba pierwsza");
        }
        else if(getPrime(number) == 3)
        {
            // 1 lub 0
            System.out.println("Ani złożona ani pierwsza");

        }
        else System.out.println("ARGH!");
    }



   static int getPrime(int num)
    {

        if(num<2) return 3;
        int i = 2;
        while(i<num)
        {
            if(num%i==0)
            {
                return 1;
            }
            else if(num%i!=0) {}
            i++;
        }
        return 2;
    }



}
