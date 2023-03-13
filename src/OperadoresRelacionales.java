public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j= 7;
        float  k = 127e-7f;
        double l = 2.1413e3;
        boolean s = false;
        
        boolean v1 = i== j ;
        System.out.println("v1 = " + v1);
        
        boolean b2 = !v1 ;
        System.out.println("b2 = " + b2);
        
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = s ==true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = s != true;
        System.out.println("b5 = " + b5);
        
        boolean b6 = i>j;
        System.out.println("b6 = " + b6);
        
        boolean b7 = i<j;
        System.out.println("b7 = " + b7);
    }
}
