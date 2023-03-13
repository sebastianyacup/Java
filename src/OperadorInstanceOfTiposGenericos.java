public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String ... que tal!";
        Number num = Integer.valueOf(7);

        boolean b1 = texto instanceof  String;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof  Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = num instanceof  Integer;
        System.out.println("Num es del tipo Integer = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);
        Number decimeal = 45.54;
        b1 = decimeal instanceof Double;
        System.out.println("decimeal es de tipo double = " + b1);
        b1 = decimeal instanceof Float;
        System.out.println("decimal es de tipo float = " + b1);
        b1= decimeal instanceof Number;
        System.out.println(" decimal es detipo number= " + b1);

    }
}
