import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la pelicula Matrix" );
         int fechaLanzamiento = 2006;
         double puntaje = 4.3;
         boolean incluidoPlan = true;
         String nombre = "Matrix";
         String sinopsis = """
                 LA pelicula mas famosa del milenio
                 """;
         double sumaNota = 0;

        System.out.println(fechaLanzamiento);
        System.out.println(puntaje);
        System.out.println(incluidoPlan);
        System.out.println(nombre);
        System.out.println(sinopsis);

        /*double mediaEvaluacion = (4.2+3.3+2.5)/3;
        if(mediaEvaluacion > 8){
            System.out.println("popular en el momento");
        }else {
            System.out.println("pelicula que vale la pena ver");
        }*/

        for(int i=0;i<3;i++){
            Scanner leer = new Scanner(System.in);
            System.out.println("escribe tu puntaje");
             double nota = leer.nextDouble();
             sumaNota += nota;
        }//
        System.out.println("puntaje: " + sumaNota/3);
      }
}




