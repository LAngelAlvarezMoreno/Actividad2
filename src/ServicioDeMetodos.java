import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioDeMetodos
{
    Scanner leer = new Scanner(System.in);

    /**
     *
     * @param calificaciones para calcular el promedio,
     * @return -> result con el dato del promedio obtenido.
     */
    public float ObtenerPromedio(ArrayList<Integer> calificaciones)
    {
        float result;

        int suma = calificaciones.stream().mapToInt(item -> item).sum();

        result = (float) suma / 5;
//        para este ejemplo nos pide el promedio sobre 5 calificacione
//           por eso le definimos el 5 directamente... en caso de tener mas de 5 calificaciones ingresadas; podemos realizar la siguiente forma
//         result = (float) suma / calificaciones.calificaciones.size();

        return  result;
    }

    /**
     * solicitamos nombre y lo almancenamos.
     * @return nombre capturado en variable -> Nombre
     */
    public String LeerNombre()
    {
        String Nombre;

        System.out.println("Dime tu nombre: ");
        Nombre = leer.nextLine();

        return Nombre;
    }

    /**
     * leemos las calificaciones y las almacenamos en variable -> Calificaciones
     * @return lista de calificaciones.
     */
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

    /**
     * Recibimos en parametro el promedio de las calificaciones que se ingresaron para definicer la Calificacion de acuerdo a la
     * tabla definida previamente
     *  @param promedio
     * @return -> Calificacion
     */
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

    /**
     * metodo para imprimir en pantalla la informacion recabada.
     * @param nombre es el que solicitamos que escribieran
     * @param calificaciones lista con las 5 calificaciones solicitadas
     * @param promedio resultado al promediar las calificaciones obtenidas
     * @param calificacion obtenida al validar con la tabla previamente definida.
     */
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
