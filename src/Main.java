public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicuala = 8.2;

        double media = (8.2 + 6.0 +9.0) / 3 ;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja 
                la mejor pelicula del fin del milenio
                Fué lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);


    }
}