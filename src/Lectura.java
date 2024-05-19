import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento");
        int fechaLanzamiento = teclado.nextInt();
        System.out.println("Escribe el nombre de tu película favorita");
        double nota = teclado.nextDouble();

        System.out.println("película = " + pelicula);
        System.out.println("fechaLanzamiento = " + fechaLanzamiento);
        System.out.println("nota = " + nota);
    }
}
