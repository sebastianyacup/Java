import java.util.Scanner;

public class EjercicioMostarDosNumerosOrdenados {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese  el primer numero ");
        int num1 = s.nextInt();

        System.out.println("Ingrese un Segundo Numero");
        int num2 = s.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;


        System.out.println("Numero ordenados de mayor a menor " +  resultado );

    }
}
