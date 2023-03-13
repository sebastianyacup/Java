import java.util.InputMismatchException;
import java.util.Scanner;

public class entradaDatosTerminal {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");

        try {
            numeroDecimal = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            return;
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario ="numeroBinario  de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal +  " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje +=  "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
