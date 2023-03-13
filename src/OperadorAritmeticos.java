import javax.swing.*;

public class OperadorAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i = " +(i+j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i = " +(i-j));

        int multi = i* j;
        System.out.println("multi = " + multi);

        float div = (float) i/j;
        System.out.println("div = " + div);
        
        int resto = i% j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("numero  par = " + numero);
        }else {
            System.out.println("numero es impar = " + numero);
        }
    }
}
