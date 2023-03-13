import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String Variable = 7 == 7 ? "si es verdadero": "si es falso" ;
        System.out.println("Variable = " + Variable);
        
        String estado = "";
        double promedio = 0.0;

        double matameticas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0");
        matameticas = s.nextDouble();

        System.out.println("Ingrese la nota de Ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de Historia entre 2.0 - 7.0");
        historia =  s.nextDouble();

        promedio = (matameticas + ciencias + historia) /3;
        System.out.println("promedio = " + promedio);
        estado = promedio >=5.4 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);


    }
}
