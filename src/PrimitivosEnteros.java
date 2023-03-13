public class PrimitivosEnteros {
    public static void main(String[] args) {


        byte numeroByte = 127; // va hasta 128
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bytes a" + Byte.SIZE);
        System.out.println("tipo byte corresponde en byte a" + Byte.BYTES);
        System.out.println("Valor maximo de un byte "+ Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte "+ Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a" + Short.SIZE);
        System.out.println("tipo short  corresponde en byte a" + Short.BYTES);
        System.out.println("Valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroShort = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a" + Integer.SIZE);
        System.out.println("tipo int  corresponde en byte a" + Integer.BYTES);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a" + Long.SIZE);
        System.out.println("tipo long  corresponde en byte a" + Long.BYTES);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
        
        var numeroVar = 3.4028235E39D;
        System.out.println("numeroVar = " + numeroVar);

    }
}
