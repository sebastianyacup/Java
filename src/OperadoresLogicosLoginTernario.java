import java.util.Scanner;

public class OperadoresLogicosLoginTernario {
    public static void main(String[] args) {
/*
        String [] usernames = new String[2];
        String[] passwords = new  String[3];


        usernames[0] = "sebastian";
        passwords[0] = "12345";

        usernames[1]= "Nicolas";
        passwords[1] = "12345";

        usernames[2]= "Pepe";
        passwords[2] = "12345";
        */
        String[] usernames = {"Andres", "Sebastian", "Arcenio"};
        String[] passwords = {"123", "1234", "12345"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String usuario = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(p)) ? true : esAutenticado;
        }
            /*
            if((usernames[i].equals(usuario) && passwords[i].equals(p))){
                esAutenticado = true;
                break;
            }
        }
        if (esAutenticado){
            System.out.println("Bienvenido te acabas de logear ".concat(usuario).concat("!"));
        } else {
            System.out.println("Usuario o contraseña no valida");
        }*/

        String mensaje = esAutenticado ? "Bienvenido te acabas de logear ".concat(usuario).concat("!") : "Usuario o contraseña no valida";
            System.out.println(mensaje);
    }
}
