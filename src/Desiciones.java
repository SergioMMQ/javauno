public class Desiciones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicuala = 8.2;
        String tipoPlan = "plus";

//        codigo que prueba los operadoes relacionales

        if (fechaDeLanzamiento >= 2022){
            System.out.println("péliclas mas populares");
        }else{
            System.out.println("Pelicula Retro que aun vale la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
