import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ServicioDeMetodos servicioDeMetodos = new ServicioDeMetodos();
        ArrayList<Integer> calificaciones = new ArrayList<>();
        double promedio=0;
        char calificacion='F';
        String nombre = "";

        nombre = servicioDeMetodos.LeerNombre();
        calificaciones =  servicioDeMetodos.LeerCalificaciones();
        promedio = servicioDeMetodos.ObtenerPromedio(calificaciones);
        calificacion = servicioDeMetodos.ObtenerCalificacion(promedio);

        servicioDeMetodos.ImprimirInformacion(nombre, calificaciones, promedio, calificacion);
    }
}