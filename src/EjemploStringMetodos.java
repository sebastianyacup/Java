import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Sebastian";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Sebastian\") = " + nombre.equals("Sebastian"));
        System.out.println("nombre.equals(\"Sebastian\") = " + nombre.equals("sebastian"));
        System.out.println("nombre.compareTo(\"sebastian\") = " + nombre.compareTo("sebastian"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(4) = " + nombre.substring(1, 4));
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\",\"b\") = " + trabalengua.replace("a","b"));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('g') = " + trabalengua.indexOf('g'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf("lenguas"));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf("lenguas"));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t"));
        System.out.println("trabalengua.startsWith(\"tr\") = " + trabalengua.startsWith("tr"));
        System.out.println("trabalengua.endsWith(\"as\") = " + trabalengua.endsWith("as"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());
    }
}
