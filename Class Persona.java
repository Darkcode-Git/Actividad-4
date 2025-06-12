import java.util.*;
import java.util.stream.*;

class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double sueldoHora;
    private String cargo;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String genero, double sueldoHora, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.sueldoHora = sueldoHora;
        this.cargo = cargo;
    }

    // Getters and Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public double getSueldoHora() { return sueldoHora; }
    public void setSueldoHora(double sueldoHora) { this.sueldoHora = sueldoHora; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}

public class Principal {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese los datos de la persona (o 'fin' para terminar):");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) break;

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Gnero: ");
            String genero = scanner.nextLine();

            System.out.print("Sueldo por hora: ");
            double sueldoHora = Double.parseDouble(scanner.nextLine());

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            personas.add(new Persona(nombre, apellido, edad, genero, sueldoHora, cargo));
        }

        // a. Calcular la cantidad de personas almacenadas
        long cantidadPersonas = personas.stream().count();
        System.out.println("a. Cantidad de personas almacenadas: " + cantidadPersonas);

        // b. Calcular el promedio de edades
        double promedioEdades = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
        System.out.println("b. Promedio de edades: " + promedioEdades);

        // c. Mostrar la cantidad de personas mayores de edad
        long mayoresDeEdad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .count();
        System.out.println("c. Cantidad de personas mayores de edad: " + mayoresDeEdad);

        // d. Mostrar las personas cuyos nombres empiecen con "A"
        System.out.println("d. Personas cuyos nombres empiezan con 'A':");
        personas.stream()
                .filter(p -> p.getNombre().startsWith("A"))
                .forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));

        // e. Mostrar las personas cuyos apellidos contengan la letra "M"
        System.out.println("e. Personas cuyos apellidos contienen la letra 'M':");
        personas.stream()
                .filter(p -> p.getApellido().contains("M"))
                .forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));
    }
}
    while (true) {
        System.out.println("Ingrese los datos de la persona (o 'fin' para terminar): ");
        String nombre = scanner.nextLine();
        if (nombre.equalsIgnoreCase("fin")) break;

        personas.add(new Persona(nombre, scanner.nextLine(), Integer.parseInt(scanner.nextLine()),
                scanner.nextLine(), Double.parseDouble(scanner.nextLine()), scanner.nextLine()));
    }

    System.out.println("a. Cantidad de personas almacenadas: " + personas.size());

    double promedioEdades = personas.stream().mapToInt(Persona::getEdad).average().orElse(0);
    System.out.println("b. Promedio de edades: " + promedioEdades);

    long mayoresDeEdad = personas.stream().filter(p -> p.getEdad() >= 18).count();
    System.out.println("c. Cantidad de personas mayores de edad: " + mayoresDeEdad);

    System.out.println("d. Personas cuyos nombres empiezan con 'A': ");
    personas.stream().filter(p -> p.getNombre().startsWith("A"))
            .forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));

    System.out.println("e. Personas cuyos apellidos contienen la letra 'M': ");
    personas.stream().filter(p -> p.getApellido().contains("M"))
            .forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));
}
