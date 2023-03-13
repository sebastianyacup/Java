import java.util.Scanner;

public class EjerciciodeSistemaEstanquedeGasolina {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la medida actual  (maximo 70 litros)");
        double ingresa = s.nextInt();

        if (ingresa == 70){
            System.out.println("Estanque se encuentra lleno con " + ingresa + " Litros");
        }
        if (ingresa>=60 && ingresa<70){
            System.out.println("Estanque casi lleno con " + ingresa + " Litros");
        }
        if (ingresa<60 && ingresa>=40){
            System.out.println("Estanque 3/4 con " + ingresa + " Litros");
        }
        if (ingresa<40 && ingresa>=35){
            System.out.println("Medio Estanque con " + ingresa + " Litros");
        }
        if (ingresa<35 && ingresa>=20){
            System.out.println("Suficiente " + ingresa +  " Litros");
        }
        if (ingresa<20 && ingresa> 1){
            System.out.println("Insuficiente " + ingresa  + " Litros");
        }
        if (ingresa>70 || ingresa<1){
            System.out.println("Ingrese una medida  valida");
        }
    }
}