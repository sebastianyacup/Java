public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String NombredeFamilia1 = "Sebastian Aguirre Yacup";
        String NombredeFamilia2 = "Arcenio Perez Alzate";
        String NombredeFamilia3 = "Monica Ortega Alcazar";

        String family1 = " ";
        String family2 = " ";
        String family3 = " ";

        // Primer nombre//
        char[] arreglo = NombredeFamilia1.toCharArray();
        int largo = arreglo.length;
        // Segundo nombre
        char[] arregloN2 = NombredeFamilia2.toCharArray();
        int largoN2 = arregloN2.length;
        // Tercer Nombre
        char[] arregloN3 = NombredeFamilia3.toCharArray();
        int largoN3 = arregloN3.length;


        for (int i = 0; i< 1 ; i++) {
            family1 = String.valueOf(arreglo[i]);
            family2 = String.valueOf(arregloN2[i]);
            family3 = String.valueOf(arregloN3[i]);
        }
        //System.out.println(family1);
        //System.out.println(family2);
        //System.out.println(family3);

          // Ultimos dos letras Nombre1
        String[] arreglo2= NombredeFamilia1.split("c");
        int largo2= arreglo2.length;
        //System.out.println(arreglo2[largo2-1]);
        // Ultimos dos letras Nombre2
        String[] arregloA2= NombredeFamilia2.split("a");
        int largoA2= arregloA2.length;
        //System.out.println(arregloA2[largoA2-1]);
        // Ultimos dos letras Nombre3
        String[] arregloA3= NombredeFamilia3.split("z");
        int largoA3= arregloA3.length;
        //System.out.println(arregloA3[largoA3-1]);

        System.out.println("Resultado final de nombres = " + family1+"."+(arreglo2[largo2-1])+"_"+family2+"."+(arregloA2[largo2-1]+"_"+family3+"."+(arregloA3[largoA3-1])));
    }
}

// otra solucion insertando el codigo
/*
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
} */
