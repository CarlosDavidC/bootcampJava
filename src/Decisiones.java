public class Decisiones {
    public static void main(String[] args) {
        int fechaLanzamiento = 1999;
        boolean incluidoPlan = true;
        double notaPelucila = 8.2;
        String tipoPlan = "plus";

//        if (fechaLanzamiento >= 2022){
//            System.out.println("Películas más populares");
//        }else {
//            System.out.println("Películas retro que aún vale la pena ver");
//        }

        if (incluidoPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute su película");
        }else {
            System.out.println("Película no disponible para su plan actual");
        }
    }
}
