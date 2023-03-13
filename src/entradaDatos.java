import javax.swing.*;

public class entradaDatos {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        try {
            numeroDecimal =Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero entero"));
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null , "Error debe ingresar un numero entero");
            main(args);
            return;
        }
        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario ="numeroBinario  de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0B111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal +  " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje +=  "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null , mensaje);
    }
}
