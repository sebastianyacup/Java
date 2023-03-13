import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String nombreFactura = "0 ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura:");
        try {
            nombreFactura = scanner.nextLine();

        } catch (Exception e){
            System.out.println("Error debe ingresar un Nombre");
            main(args);
            return;
        }
        System.out.println("Ingrese el precio del producto 1 y 2 : ");
        double precioUno = 0;
        double precioDos = 0;
        try {
            precioUno = scanner.nextDouble();
            precioDos = scanner.nextDouble();

        } catch (Exception e){
            System.out.println("Error debe ingresar un valor");
            main(args);
            return;
        }

        double calculoTotal = precioUno + precioDos * 0.19;
        System.out.println("nombreFactura = " + nombreFactura);
        System.out.println("precioUno = " + precioUno);
        System.out.println("precioDos = " + precioDos);
        System.out.println("calculoTotal = " + calculoTotal);


    }
}
