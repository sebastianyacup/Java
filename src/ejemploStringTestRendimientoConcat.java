public class ejemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i< 10000; i++){

            //c = c.concat(a).concat(b).concat("\n"); //500 => 2ms  , 1000 => 6ms

            //c += a + b + "\n"; // 19 => 24 ms  // 48 ms

            sb.append(a)
                    .append(b)
                    .append("\n");  // 500 => 0 ms  , 1000 => 0 ms //10000 => 2 ms

        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
