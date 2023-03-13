public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 6.2f;

        if(promedio >= 6.5){
            System.out.println("Felicitaciones excelente promedio");
        }else if(promedio>= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >=5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular promedio");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente promedio");
        }else {
            System.out.println("Reprobado");
        }
        System.out.println("tu promedio es = " + promedio);
    }
}
