import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ServicioDeMetodos metodo = new ServicioDeMetodos();
        ArrayList<Integer> calificaciones;
        float promedio;
        char calificacion;
        String nombre;

        nombre = metodo.LeerNombre(); //solicitamos nombre.
        calificaciones = SolicitaCalificaciones(); //solicitamos calificaciones.
        if (!(calificaciones.isEmpty())){
            promedio = metodo.ObtenerPromedio(calificaciones);  //obtenemos el promedio a partir de las calificaciones solicitadas.
            calificacion = metodo.ObtenerCalificacion(promedio); //definidmos la Calificacion a partir del promedio obtenido.

            metodo.ImprimirInformacion(nombre, calificaciones, promedio, calificacion);//mostramos en pantalla los datos recabados.
        }
    }

    /**
     * metodo para leer las calificaciones e indicar que solo puede ingresar valores numericos.
     * @return lista de calificaciones solicitada
     */
    private static ArrayList<Integer> SolicitaCalificaciones()
    {
        ServicioDeMetodos metodo = new ServicioDeMetodos();
        try {
           return  metodo.LeerCalificaciones();
        }
        catch (Exception ex)
        {
            System.out.println("Ingresa información valida. <<Solo números>> " + ex.getMessage());
           return SolicitaCalificaciones();
        }
    }
}