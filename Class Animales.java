import java.util.*;

class Animal {
    private final String nombre;
    private final String tipo;
    private final String genero;

    public Animal(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo.toLowerCase();
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class Principal {
    private final Map<String, List<Animal>> clasificacion = new TreeMap<>();

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el nombre del animal: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el tipo (terrestre/aéreo/acuático): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese el género (masculino/femenino): ");
            String genero = scanner.nextLine();

            clasificacion.computeIfAbsent(tipo, k -> new ArrayList<>()).add(new Animal(nombre, tipo, genero));

            System.out.print("¿Desea ingresar otro animal? (s/n): ");
            if (!scanner.nextLine().equalsIgnoreCase("s")) break;
        }

        mostrarClasificacion();
    }

    private void mostrarClasificacion() {
        clasificacion.forEach((tipo, animales) -> {
            System.out.println(capitalize(tipo) + "s:");
            animales.forEach(animal -> System.out.println("    " + animal));
            System.out.println();
        });
    }

    private String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void main(String[] args) {
        new Principal().ejecutar();
    }
}
