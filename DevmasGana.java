import java.util.*;
import java.util.stream.*;

public class Principal {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Existing code for input...

        // Create masGana attribute of type Optional<Persona>
        Optional<Persona> masGana = personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador"))
                .max(Comparator.comparingDouble(Persona::getSueldoHora));

        // Evaluate masGana.isPresent() and print the person's data if true
        if (masGana.isPresent()) {
            Persona desarrolladorMejorPagado = masGana.get();
            System.out.println("Desarrollador que más gana por hora:");
            System.out.println("Nombre: " + desarrolladorMejorPagado.getNombre());
            System.out.println("Apellido: " + desarrolladorMejorPagado.getApellido());
            System.out.println("Edad: " + desarrolladorMejorPagado.getEdad());
            System.out.println("Género: " + desarrolladorMejorPagado.getGenero());
            System.out.println("Sueldo por hora: import java.util.*;
import java.util.stream.*;

public class Principal {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Existing code for input...

        // Create masGana attribute of type Optional<Persona>
        Optional<Persona> masGana = personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador"))
                .max(Comparator.comparingDouble(Persona::getSueldoHora));

        // Evaluate masGana.isPresent() and print the person's data if true
        if (masGana.isPresent()) {
            Persona desarrolladorMejorPagado = masGana.get();
            System.out.println("Desarrollador que más gana por hora:");
            System.out.println("Nombre: " + desarrolladorMejorPagado.getNombre());
            System.out.println("Apellido: " + desarrolladorMejorPagado.getApellido());
            System.out.println("Edad: " + desarrolladorMejorPagado.getEdad());
            System.out.println("Género: " + desarrolladorMejorPagado.getGenero());
            System.out.println("Sueldo por hora: $" + desarrolladorMejorPagado.getSueldoHora());
            System.out.println("Cargo: " + desarrolladorMejorPagado.getCargo());
        } else {
            System.out.println("No se encontraron desarrolladores en la lista.");
        }
    }
}
quot; + desarrolladorMejorPagado.getSueldoHora());
            System.out.println("Cargo: " + desarrolladorMejorPagado.getCargo());
        } else {
            System.out.println("No se encontraron desarrolladores en la lista.");
    }
}

