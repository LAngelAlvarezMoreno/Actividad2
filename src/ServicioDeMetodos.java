import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioDeMetodos
{
    Scanner leer = new Scanner(System.in);
    public float ObtenerPromedio(ArrayList<Integer> calificaciones)
    {
        float result;

        int suma = calificaciones.stream().mapToInt(item -> item).sum();

        result = (float) suma / 5;

        return  result;
    }

    public String LeerNombre()
    {
        String Nombre;

        System.out.println("Dime tu nombre: ");
        Nombre = leer.nextLine();

        return Nombre;
    }
    public ArrayList<Integer> LeerCalificaciones()
    {
        ArrayList<Integer> Calificaciones = new ArrayList<>();
            for (int i = 0; i<5; i++)
            {
                System.out.println("Dime la calificación " + (i + 1) + " : ");
                Calificaciones.add(leer.nextInt());
            }
        return Calificaciones;
    }

    public char ObtenerCalificacion(double promedio)
    {
        char Calificacion = 'F';

        if (promedio >= 51  && promedio <= 60) {
            Calificacion = 'E';
        } else if (promedio >= 61 && promedio <= 70) {
            Calificacion = 'D';
        } else if (promedio >= 71 && promedio <= 80) {
            Calificacion = 'C';
        } else if (promedio >= 81 && promedio <= 90) {
            Calificacion = 'B';
        } else if (promedio >= 91) {
            Calificacion = 'A';
        }

        return Calificacion;
    }

    public void ImprimirInformacion(String nombre, ArrayList<Integer> calificaciones, double promedio, char calificacion)
    {
        System.out.println("***************************************************");
        System.out.println("Nombre: " + nombre.toUpperCase());
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println("Calificación " + (i+1) + " es: " + calificaciones.get(i));
        }
        System.out.println("Tu promedio es: " + formatoDecimal.format(promedio));
        System.out.println("Tu Calificación Final es: " + calificacion);
        System.out.println("***************************************************");
    }

    private static final DecimalFormat formatoDecimal = new DecimalFormat("0.00");
}
