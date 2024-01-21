import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ServicioDeMetodos metodo = new ServicioDeMetodos();
        ArrayList<Integer> calificaciones;
        float promedio;
        char calificacion;
        String nombre;

        nombre = metodo.LeerNombre();
        calificaciones = SolicitaCalificaciones();
        if (!(calificaciones.isEmpty())){
            promedio = metodo.ObtenerPromedio(calificaciones);
            calificacion = metodo.ObtenerCalificacion(promedio);

            metodo.ImprimirInformacion(nombre, calificaciones, promedio, calificacion);
        }
    }

    private static ArrayList<Integer> SolicitaCalificaciones()
    {
        ServicioDeMetodos metodo = new ServicioDeMetodos();
        try {
           return  metodo.LeerCalificaciones();
        }
        catch (Exception ex)
        {
            System.out.println("Ingresa información valida. <<Solo números>> ");
           return SolicitaCalificaciones();
        }
    }
}