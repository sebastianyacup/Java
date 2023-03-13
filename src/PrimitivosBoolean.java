public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 987565.43e-3;
        System.out.println("d = " + d);
        float f = 1.2345e2F;
        System.out.println("f = " + f);

        datoLogico= d > f;

        System.out.println("datoLogico = " + datoLogico);
    }
}
