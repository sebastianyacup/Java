public class PrimitivosFloat {
    public static void main(String[] args) {
        float correrComaFloat = 1.5e4F; //15000f
        System.out.println("correrComaFloat = " + correrComaFloat);
        float correrComaMenosFloat = 1.5e-3F; // 000,15
        System.out.println("correrComaMenosFloat = " + correrComaMenosFloat);
        float realFloat = 1.0F;
        System.out.println("real float = " + realFloat);
        float numeroFloat = 9223372036854775808F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en bytes a" + Float.SIZE);
        System.out.println("tipo float  corresponde en byte a" + Float.BYTES);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);

        double numeroDoble = 3.4028235E39;
        System.out.println("numeroDoble = " + numeroDoble);
        System.out.println("tipo Double corresponde en bytes a" + Double.SIZE);
        System.out.println("tipo Double  corresponde en byte a" + Double.BYTES);
        System.out.println("Valor maximo de un Double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un Double: " + Double.MIN_VALUE);
    }
}
