import java.util.Scanner;

public class EJER2
{
    public static void main(String[]args)
    {
        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una nota");
        nota = sc.nextDouble();

        if ( nota >= 9 && nota == 10){

            System.out.println("EXCELENTE");

        }

        else if ( nota >= 6.5 && nota < 9){

            System.out.println("NOTABLE");

        }

        else if ( nota > 5 && nota < 6.5 ){

            System.out.println("APROBADO");

        }

        else if ( nota < 5 && nota >= 0){

            System.out.println("SUSPENDIDO");

        }

        else{

            System.out.println("Nota no valida");

        }

    }

}