import java.util.Scanner;

public class EJER1 
{

    public static void main (String[]args)
    {

        int num;
        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe el numero");
        num = sc.nextInt();

        if (num == 240){

            System.out.println("Muy bien, has acertado.");

        }

        else {

            System.out.println("Has fallado.");
            sc.close ();

        }







    }




}
