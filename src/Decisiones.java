public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        }else {
            System.out.println("Peliculas retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfruta esta pelicula");
        }else {
            System.out.println("Pelicula mo disponible para su plan actual");
        }

    }
}
