public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = " + caracter);
        System.out.println(" decimal = caracter ="+ (decimal == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea= '\n';
        char retornoCarro = '\r';

        System.out.println("Char corresponde en byte="+System.lineSeparator()+Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Char.Min_Value = " + Character.MIN_VALUE);
        System.out.println("Char Max_Value = " + Character.MAX_VALUE);



    }
}
