import java.util.Scanner;

public class EJER1 
{

    public static void main (String[]args)
    {

        int num;
        Scanner sc = new Scanner (System.in);




        System.out.println("Escribe el numero");       //Aqui se escribe el numero secreto

        if (num == 230){

            System.out.println("Muy bien, has acertado.");      //Comentario que sale al acertar el numero

        }




        else {

            System.out.println("Has fallado.");         //Comentario que sale al fallar el numero
            sc.close ();

        }

    }


}
